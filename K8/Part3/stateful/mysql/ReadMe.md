## Deploye stateful mongo

```
 kubectl apply -f mongo-service.yml
 kubectl apply -f mongo-stateful.yml
 kubectl exec -it mongod-0 -c mongod-container-app bash
 hostname -f
 mongod-0.mongodb-service.default.svc.cluster.local
```