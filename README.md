# Spring Boot Kubernetes Demo

## Build Application
cd app
mvn clean package

## Build Docker Image
docker build -t shefeeqpm/spring-k8s-demo:v1 .

docker push shefeeqpm/spring-k8s-demo:v1

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

## create HPA
kubectl apply -f hpa.yml

## To generate load on a deployment and see HPA working.
sudo apt update

sudo apt install apache2-utils -y

ab -n 300000 -c 300 -H "Host: hostname" http://<external-ip>/

eg: ab -n 300000 -c 300 -H "Host: qa.demo.com" http://136.110.225.71/

## watch scale up/down 
kubectl get  hpa [hpa-name] -w -n [namespace]

eg: kubectl get  hpa spring-app-hpa -w -n qa
