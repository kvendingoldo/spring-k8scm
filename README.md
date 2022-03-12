# spring-k8scm

### How to use it
1. Build `echo` application
```shell
mvn install -P
docker tag localhost/echo/app:000 <IMAGE_NAME>
docker push <IMAGE_NAME>
```

2. Deploy K8S namespace:
```shell
kubectl apply -f ~/spring-k8scm/echo-service/src/k8s/namespace.yaml
```
3. Fix config file `kubectl apply -f ~/spring-k8scm/echo-service/src/main/resources/example/namespace.yaml`. Pay attention to `imagePullSecrets` and `image: <YOUR_IMAGE>`

4. Deploy K8S resources:
```shell
kubectl apply -f ~/spring-k8scm/echo-service/src/k8s/service.yaml
```

