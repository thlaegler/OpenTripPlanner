ARG BASE_IMAGE
FROM $BASE_IMAGE

ARG SERVICE_NAME

ENV OTP_AREA "NZ"
ENV OTP_PROFILE "SERVER"
ENV PROJECT_ID "mobility23"
ENV JAVA_OPTS "-Xmx3G -server -Xverify:none -XX:+UnlockExperimentalVMOptions -XX:+UseParallelGC"
ENV PATH /usr/local/gcloud/google-cloud-sdk/bin:$PATH
ENV GOOGLE_APPLICATION_CREDENTIALS="/etc/config/service-account.json"


# GoogleCloud
ARG CLOUD_SDK_VERSION=282.0.0
ENV CLOUD_SDK_VERSION=$CLOUD_SDK_VERSION
ENV PATH /google-cloud-sdk/bin:$PATH
ENV CLOUDSDK_PYTHON=python3
RUN apt-get -qqy update && apt-get install -qqy \
        curl \
        gcc \
        python3-dev \
        python3-pip \
        apt-transport-https \
        lsb-release \
        openssh-client \
        git \
        make \
        gnupg && \
    pip3 install -U crcmod
RUN curl -O https://dl.google.com/dl/cloudsdk/channels/rapid/downloads/google-cloud-sdk-${CLOUD_SDK_VERSION}-linux-x86_64.tar.gz && \
    tar xzf google-cloud-sdk-${CLOUD_SDK_VERSION}-linux-x86_64.tar.gz && \
    rm google-cloud-sdk-${CLOUD_SDK_VERSION}-linux-x86_64.tar.gz \
  && /google-cloud-sdk/install.sh --bash-completion=false --path-update=true --usage-reporting=false
VOLUME ["/root/.config"]


ADD target/${SERVICE_NAME}-2.0.0-SNAPSHOT-shaded.jar /app.jar
ADD cloudbuild/entrypoint.sh /entrypoint.sh
ADD service-account.json /etc/config/service-account.json


EXPOSE 8080 8081 8085


ENTRYPOINT [ "/bin/bash", "entrypoint.sh" ]
