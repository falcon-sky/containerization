# Install npm
 ```
 https://nodejs.org/en/download/
 ```
# Install Package:

```
$ npm init -y          # Create package.json file
$ npm install express  # install express and add to package.json
```

# Run application:

```
 $ node app.js
```
node app.js

# Dockerising The Node App

## Create Dockerfile 
 ```
  Description
  https://docs.docker.com/language/nodejs/build-images/
```

## Create Docker Image
```
 $ docker build --tag falcon007/node-docker .
```

## Run Docker image
```
 $ docker run -p 3000:3000 --name node-app falcon007/node-docker:latest

Background Running

 $ docker run -d -p 3000:3000 --name node-app falcon007/node-docker:latest
```

## Test Running Container

```
 http://localhost:3000/
```

## Stop Docker Container

```
$  docker stop node-app  # Or container ID
```

## Tag Docker Image

```
 $ docker tag falcon007/node-docker:latest node-docker:v1.0.0
```

## Untagged docker image

```
 docker rmi node-docker:v1.0.0
```

## Push Docker image (https://hub.docker.com/)

```
docker push <repository-name>/springsecurity

docker push falcon007/node-docker:latest
```

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
 $ docker pull falcon007/node-docker:latest
```

## Pull Docker image while running

```
 $ docker run -d -p 3000:3000 --name node-app falcon007/node-docker:latest
```
## Inspect container

``` 
docker exec -ti <container-id> /bin/sh
```

## Docker compose commands

``` 
 $ docker-compose up    #(-d) in detached mode
 $ docker-compose logs
 $ docker-compose ps
 $ docker-compose down
```