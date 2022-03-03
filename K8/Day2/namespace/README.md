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