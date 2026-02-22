# Spring Boot Kubernetes Demo

## Build Application
cd app
mvn clean package

## Build Docker Image
docker build -t <your-dockerhub-username>/spring-k8s-demo:v1 .
docker push <your-dockerhub-username>/spring-k8s-demo:v1

## Deploy Dev
kubectl apply -f k8s/dev/
kubectl apply -f k8s/base/ -n dev

## Deploy QA
kubectl apply -f k8s/qa/
kubectl apply -f k8s/base/ -n qa

## Deploy Prod
kubectl apply -f k8s/prod/
kubectl apply -f k8s/base/ -n prod

## Get Ingress IP
kubectl get ingress -A
