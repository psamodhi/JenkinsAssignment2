FROM ubuntu

COPY ./out/production/DockerAssignment/ /tmp

WORKDIR /tmp

RUN apt-get update && \
    apt-get install -y openjdk-17-jre && \
    apt-get install -y maven

ENTRYPOINT ["java", "Main"]