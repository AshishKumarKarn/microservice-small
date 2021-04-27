# microservice-small

1. Run multiple instances of client-one and client-master-data-receiver using below command on different ports
`mvn clean package spring-boot:run -Dspring-boot.run.arguments=--server.port=8020`
2. Run karn-eureka-server-ms
`mvn clean package spring-boot:run`
   ##### optionally, you can run microservice server on multiple instances,
   ##### just remember to add comma-separated values of eureka.client.serviceUrl.defaultZone in each client project
Access for Eureka server monitoring:
<url> http://localhost:8888/ </url>

ms-cloud-config-server for putting properties in cloud

Access For Data: <url> http://localhost:8021/v1/data </url>
