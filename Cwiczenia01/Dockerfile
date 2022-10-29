FROM ubuntu:22.04

#3.0
RUN apt-get update
RUN apt-get -y install software-properties-common
RUN add-apt-repository ppa:deadsnakes/ppa
RUN apt-get -y install tzdata
ENV TZ="Europe/Warsaw"
RUN apt-get -y install python3.8
#3.5
RUN apt -y install openjdk-8-jdk
RUN apt -y install kotlin
#4.0 i 4.5
RUN mkdir /opt/gradle
WORKDIR "/opt/gradle"
RUN apt -y install wget
RUN apt -y install unzip
RUN wget https://downloads.gradle-dn.com/distributions/gradle-7.5.1-bin.zip
RUN unzip gradle-7.5.1-bin.zip
ENV PATH=$PATH:/opt/gradle/gradle-7.5.1/bin
WORKDIR "/"
COPY ExampleGradleProject /ExampleGradleProject
WORKDIR "/ExampleGradleProject"

CMD [ "gradle", "run" ]                         
