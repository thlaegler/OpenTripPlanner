#!/bin/bash


usage() {
    cat <<EOF
NAME
    ${0##*/} Run mobility23-otp2 with OTP_PROFILE

SYNOPSIS
    ${0##*/}

Options:

    For example:
    	export OTP_PROFILE=(SERVER|BUILDER|ANALYST)
        ./entrypoint.sh

RETURN CODES
    Returns 0 on success, 1 if an error occurs.

SEE ALSO
    See the documentation on Confluence for more details, including
    instructions on creating environments.

EOF
}


#set +e
#echo $GOOGLE_APPLICATION_CREDENTIALS
#cat $GOOGLE_APPLICATION_CREDENTIALS
gcloud auth activate-service-account --key-file="$GOOGLE_APPLICATION_CREDENTIALS" --verbosity=debug
#set -e

echo "Starting mobility23-otp2 in profile '$OTP_PROFILE' ..."

mkdir -p data
if [[ "$OTP_PROFILE" == "BUILDER" ]]; then
	
	# Copy all graph-relevant source files into local file system
	OTP_BUCKET_FILE_EXCLUDE=".*\.sql$|.*\.obj$"
	gsutil -m rsync -c -x "$OTP_BUCKET_FILE_EXCLUDE" "gs://$PROJECT_ID-gtfs/sources/$OTP_AREA" /data

	# Start mobility23-otp2 (it will shut down automatically after graph building)
	OTP_ARGUMENTS="--baseDirectory /data --port 8085 --maxThreads 8 --build --save --insecure"
	java $JAVA_OPTS -jar -Djava.security.egd=file:/dev/./urandom /app.jar $OTP_ARGUMENTS

	# Save graph.obj in storage bucket
	if [ -f "/data/graph.obj" ]; then
		filesize=$(stat -c%s /data/graph.obj)
		if [ "$filesize" -gt "5000000" ]; then # graph.obj must at least be 5MB
			gsutil -m cp -c /data/graph.obj "gs://$PROJECT_ID-gtfs/opentripplanner/$OTP_AREA/graph.obj"
		else
			echo "There was no valid graph.obj to copy to a storage bucket"
		fi
	fi
	if [ -d "/data/build" ]; then
		gsutil -m cp -r -c /data/build "gs://$PROJECT_ID-gtfs/opentripplanner/$OTP_AREA/build"
	fi
	
	# Try shutting down the preemptive VM
	gcloud compute instances stop mobility23-otp2-graph-builder --zone us-central1-a

elif [[ "$OTP_PROFILE" == "SERVER" ]]; then

	# Copy just the graph.obj into local file system
	# No need to cp graph.obj anymore since we use gcs-fuce
	OTP_BUCKET_FILE_EXCLUDE=".*\.sql$|.*\.zip|.*\.pbf|.*\.tif$"
	gsutil -m rsync -r -c -x "$OTP_BUCKET_FILE_EXCLUDE" "gs://$PROJECT_ID-gtfs/opentripplanner/$OTP_AREA" /data

	# Start mobility23-otp2
	OTP_ARGUMENTS="--baseDirectory /data --port 8085 --maxThreads 8 --load --serve --insecure"
	java $JAVA_OPTS -jar -Djava.security.egd=file:/dev/./urandom /app.jar $OTP_ARGUMENTS

elif [[ "$OTP_PROFILE" == "ANALYST" ]]; then

	# Copy just the graph.obj into local file system
	OTP_BUCKET_FILE_EXCLUDE=".*\.sql$|.*\.zip|.*\.pbf|.*\.tif$"
	gsutil -m rsync -c -x "$OTP_BUCKET_FILE_EXCLUDE" "gs://$PROJECT_ID-gtfs/opentripplanner/$OTP_AREA" /data

	# Start mobility23-otp2
	OTP_ARGUMENTS="--inMemory --analyst --verbose --insecure --preFlight --autoReload --basePath /data --graphs /data --maxThreads 8"
	java $JAVA_OPTS -jar -Djava.security.egd=file:/dev/./urandom /app.jar $OTP_ARGUMENTS

else

	echo "Given OTP profile is invalid: '$OTP_PROFILE'"

fi
