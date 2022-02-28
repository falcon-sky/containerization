# Project
This Apllication is use understand the basic security mechanism in sprict boot application.

## Import project
Import the project on either eclipse or inellij as a maven import project

## Building

### Maven
This project is maven project which will be build using maven command.

```bash
$ mvn clean install
```

## Dockerization

### Maven
Here i am using maven spotify plugin to create the docker image for this application.
Use the below command to create the docker image.
For creating please use your repository to create the image which will be easy to push image in your docker hub.
update in your pom.xml.
<docker.image.prefix> <your repo name> </docker.image.prefix>

```bash
$ mvn install dockerfile:build
```

### Push docker images

```bash
docker login

$ docker push <repository-name>/simple-spring-boot
$ docker push falcon007/simple-spring-boot
```

## Running

The application can be start is either locally using maven or start in docker container.

### Running the application in local environment
Using eclipse:It can be run as java application or run configuration to provide the program arguments.
You can run using maven command as:

```bash
$ mvn spring-boot:run
```

### Running the application in docker container


```
 $ docker run -p 8089:8089 --name java-app falcon007/simple-spring-boot:0.0.1

Background Running

 $ docker run -d -p 8089:8089 --name java-app falcon007/simple-spring-boot:0.0.1
```

## Testing

```
 http://localhost:8089/greet/
 http://localhost:8089/greet/rama
```

## Stop Docker Container

```
$  docker stop java-app  # Or container ID
```

## Tag Docker Image

```
 $ docker tag falcon007/simple-spring-boot:0.0.1 node-docker:v1.0.0
```

## Untagged docker image

```
 docker rmi node-docker:v1.0.0
```

## Push Docker image (https://hub.docker.com/)

```
docker push <repository-name>/springsecurity

docker push falcon007/simple-spring-boot:0.0.1
```
.idea
## View docker image

```
https://hub.docker.com/
```

## Remove docker image

```
 docker rmi <image-id>
```

## Pull Docker image

```
 $ docker pull falcon007/simple-spring-boot:0.0.1
```

## Pull Docker image while running

```
 $ docker run -d -p 3000:3000 --name node-app falcon007/simple-spring-boot:0.0.1
```
