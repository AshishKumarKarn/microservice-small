# microservice-small

1. Run multiple instances of client-one and client-master-data-receiver using below command with on different ports
`mvn clean package spring-boot:run -Dspring-boot.run.arguments=--server.port=8020`
2. Run ms-cloud-config-server
`mvn clean package spring-boot:run`
   ##### optionally, you can run microservice server on multiple instances,
   ##### just remember to add comma-separated values of eureka.client.serviceUrl.defaultZone in each client project
Access http://localhost:8021/v1/data
