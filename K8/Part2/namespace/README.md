## Create Name Space

```
kubectl create namespace java-namespace

kubectl create namespace node-namespace

kubectl create namespace python-namespace

```
## Deploye application:

```
kubectl create -f java-application.yml
kubectl create -f node-application.yml
kubectl create -f python-application.yml
```
## Get access to deployement

```
kubectl get deployment -n java-namespace
kubectl get deployment -n node-namespace
kubectl get deployment -n python-namespace

```
## Get access to pods

```
kubectl get pods -n java-namespace
kubectl get pods -n node-namespace
kubectl get pods -n python-namespace
```
## Load Balance

``` 
kubectl expose deployment nodeapp -n node-namespace --type=LoadBalancer --name=node-service
kubectl get services node-service -n node-namespace
kubectl describe services rama-service
```