## Deploying the Dashboard UI

```
kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.5.0/aio/deploy/recommended.yaml

```

## Create ServiceAccount and ClusterRoleBinding

```
kubectl apply -f dashboard-adminuser.yaml

```

## Get bearer token and save to file

```
 kubectl -n kubernetes-dashboard get secret admin-user-token-vrmtj -o go-template="{{.data.token | base64decode}}" >>token.txt
 
```
## Start the proxy server for dash board

```
 kubectl proxy
 
```

## Access dashboard url

``` 
http://localhost:8001/api/v1/namespaces/kubernetes-dashboard/services/https:kubernetes-dashboard:/proxy/

```
