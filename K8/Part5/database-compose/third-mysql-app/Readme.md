# Build App

``` 
mvn clean install
```

# Run The app

```
docker-compose -f docker-compose-mysql.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mysql.yml down

```

##POST

```
curl -X POST http://localhost:8080/user/create -H 'content-type: application/json' -d '{"name": "Rama","teamName": "beta","salary": 23000 }'

```

## Get 

``` 
curl -X GET http://localhost:8080/user/read 

```

### Maven Dockerizing
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

$ docker push <repository-name>/<app-name>

```
