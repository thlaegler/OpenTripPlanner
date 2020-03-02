#!/bin/bash


usage() {
    cat <<EOF
NAME
    ${0##*/} Graph Building / TODO
    
    Create VM:  gcloud beta compute --project=mobility23 instances create-with-container mobility23-otp2-graph-builder --zone=us-central1-a --machine-type=n1-highmem-4 --subnet=default --network-tier=PREMIUM --metadata=google-logging-enabled=true --no-restart-on-failure --maintenance-policy=TERMINATE --preemptible --service-account=472184287140-compute@developer.gserviceaccount.com --scopes=https://www.googleapis.com/auth/cloud-platform --image=cos-stable-80-12739-78-0 --image-project=cos-cloud --boot-disk-size=10GB --boot-disk-type=pd-standard --boot-disk-device-name=mobility23-otp2-graph-builder --no-shielded-secure-boot --shielded-vtpm --shielded-integrity-monitoring --container-image=gcr.io/mobility23/mobility23-otp2 --container-restart-policy=always --container-env=OTP_PROFILE=BUILDER --container-env=OTP_AREA=NZ --labels=container-vm=cos-stable-80-12739-78-0 --reservation-affinity=any

SYNOPSIS
    ${0##*/}

Options:

    For example:
        ./graph_building.sh 1.0.0-abc

RETURN CODES
    Returns 0 on success, 1 if an error occurs.

SEE ALSO
    See the documentation on Confluence for more details, including
    instructions on creating environments.

EOF
}

function stepBuildGraph() {
	source env.props
	VERSION="$1"
	
	if [ "$VERSION" == "" ]; then
		VERSION="$(cat VERSION)"
	fi
	echo "Graph Builder Version: $VERSION"

    gcloud compute instances update-container mobility23-otp2-graph-builder --container-image "gcr.io/$PROJECT_ID/mobility23-otp2:$VERSION" --container-env "OTP_AREA=new" --container-env "OTP_PROFILE=BUILDER" --zone us-central1-a
    gcloud compute instances start mobility23-otp2-graph-builder --zone "$CLUSTER_ZONE"
}

if [ $# == 0 ] ||  [ $# == 1 ]; then
	stepBuildGraph
else
    usage
    exit 1
fi