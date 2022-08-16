FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/lms-0.0.1-SNAPSHOT.jar lms.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","lms-0.0.1-SNAPSHOT.jar","--server.port=8081"]
