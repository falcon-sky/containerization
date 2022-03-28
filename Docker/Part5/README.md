## Run through docker-compose
docker-compose up

## Test

curl http://localhost:10081/caller

curl http://localhost:10081/caller/get

curl http://localhost:10082/receiver

curl http://localhost:10082/receiver/message