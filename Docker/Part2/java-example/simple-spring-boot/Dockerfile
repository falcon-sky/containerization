# Create image based on the official openjdk 8 image from dockerhub
FROM openjdk:8-jdk-alpine

#Bind volume for
VOLUME /tmp

# Read Argument from maven
ARG JAR_FILE

# Copy dependency and app code to app.jar
COPY ${JAR_FILE} app.jar

# Provide the instruction to start application or Entrypoint to start the application
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#COPY target/docker-message-server-1.0.0.jar message-server-1.0.0.jar
