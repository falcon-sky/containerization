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

## From docker container to outside services

docker run -p 10081:10081 --add-host host.docker.internal:host-gateway --rm --name caller spring-caller:1 

## Test Docker container

curl http://localhost:10081/caller

curl http://localhost:10081/caller/get

## Run docker compose

docker-compose -f docker-compose-caller.yml up

## Test container

curl http://localhost:10081/caller

## Stop container

docker-compose -f docker-compose-caller.yml up