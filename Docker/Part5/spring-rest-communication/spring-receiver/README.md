# Build
mvn clean install

# Run
mvn spring-boot:run

## Test

curl http://localhost:10082/receiver

http://localhost:10082/receiver/message

## Create Docker Image

mvn clean install -Pjib -DjibComponent=spring-receiver -DnewVersion=1 -DskipTests

## Run docker container

docker run -p 10082:10082 --rm --name caller spring-receiver:1

docker run -p 10082:10082 --network=host --rm --name receiver spring-receiver:1

docker run -p 10082:10082 --add-host host.docker.internal:host-gateway --rm --name caller spring-receiver:1 

