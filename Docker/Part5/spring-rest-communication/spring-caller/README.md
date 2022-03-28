## Build
mvn clean install

## Run Locally
mvn spring-boot:run

##Test local

curl http://localhost:10081/caller

curl http://localhost:1008/caller/get

## Create Docker Image

mvn clean install -Pjib -DjibComponent=spring-caller -DnewVersion=1 -DskipTests

## Run docker container

docker run -p 10081:10081 --rm --name caller spring-caller:1

docker run -p 10081:10081 --add-host host.docker.internal:host-gateway --rm --name caller spring-caller:1 

## Test Docker container

## Run docker compose

## Test container
