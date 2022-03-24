## Deploye stateful mongo

```
 kubectl apply -f node-service.yml
 kubectl apply -f node-stateful-application.yml
 kubectl exec -it node-0 -c node-container-app bash
 hostname -f
```