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
 $ docker run -p 3000:3000 --name python-app falcon007/python-docker:latest

Background Running

 $ docker run -d -p 3000:3000 --name python-app falcon007/python-docker:latest
```

## Test Running Container

```
 http://localhost:5000/hello
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
 $ docker run -d -p 3000:3000 --name python-app falcon007/python-docker:latest
```

### Running the application using Kubernetes.

```
kubectl create -f python-application.yml
kubectl get pods
kubectl get deployment
kubectl describe deployments python-deployment
docker ps
kubectl expose deployment python-deployment --type=LoadBalancer --name=rama-service
kubectl get services rama-service
kubectl describe services rama-service
kubectl delete -f python-application.yml
```