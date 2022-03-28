# Build
mvn clean install

# Run
mvn spring-boot:run

## Test
curl http://localhost:10082/receiver

curl http://localhost:10082/receiver/message

## Create Docker Image

mvn clean install -Pjib -DjibComponent=spring-receiver -DnewVersion=1 -DskipTests

## Run docker container

docker run -p 10082:10082 --rm --name caller spring-receiver:1

## From docker container to outside services

docker run -p 10082:10082 --add-host host.docker.internal:host-gateway --rm --name caller spring-receiver:1 

## Test Docker container

curl http://localhost:10082/receiver

curl http://localhost:10082/receiver/message

## Run docker compose

docker-compose -f docker-compose-receiver.yml up

## Test container

curl http://localhost:10082/receiver

curl http://localhost:10082/receiver/message

## Stop container

docker-compose -f docker-compose-receiver.yml up
