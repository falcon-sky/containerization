# Install python
 ```
 https://www.python.org/downloads/
 ```
# Install Package:

```
$  pip install -r requirements.txt
```

# Run application:

```
 $ python app.py
```
# Test
## Testing with url
```
http://10.0.0.4:5000/python
http://10.0.0.4:5000/version
http://10.0.0.4:5000/myname

http://127.0.0.1:5000/python
http://127.0.0.1:5000/version
http://127.0.0.1:5000/myname

http://localhost:5000/python
http://localhost:5000/version
http://localhost:5000/myname

```

# Dockerising The Node App

## Create Dockerfile 
 ```
  Description
  https://docs.docker.com/language/python/build-images/
```

## Create Docker Image
```
 $ docker build --tag falcon007/python-docker .
```
## Run Docker image
```
 $ docker run -p 5000:5000 --name python-app falcon007/python-docker:latest

Background Running

 $ docker run -d -p 5000:5000 --name python-app falcon007/python-docker:latest
```

## Test Running Container

```
 http://localhost:5000/python
```

## Stop Docker Container

```
$  docker stop python-app  # Or container ID
```

## Tag Docker Image

```
 $ docker tag falcon007/python-docker:latest python-docker:v1.0.0
```

## Untagged docker image

```
 docker rmi python-docker:v1.0.0
```

## Push Docker image (https://hub.docker.com/)

```
docker push <repository-name>/<name>:tag

docker push falcon007/python-docker:latest
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
 $ docker pull falcon007/python-docker:latest
```

## Pull Docker image while running

```
 $ docker run -d -p 3000:5000 --name python-app falcon007/python-docker:latest
```

## Docker compose commands

``` 
 $ docker-compose up    #(-d) in detached mode
 $ docker-compose logs
 $ docker-compose ps
 $ docker-compose down
```