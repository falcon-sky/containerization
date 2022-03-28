## Run through docker-compose
docker-compose up

## Test

curl http://localhost:10081/caller

curl http://localhost:10081/caller/get

curl http://localhost:10082/receiver

curl http://localhost:10082/receiver/message


## Communicate between java to python and node application

##Test

http://localhost:10081/caller/
http://localhost:10081/caller/python
http://localhost:10081/caller/node