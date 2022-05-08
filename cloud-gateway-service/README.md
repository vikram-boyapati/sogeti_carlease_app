## Summary ##

This service is api gateway for car-data-service, customer-service and lease-service APIs.

### Prerequisite ###

1. Java 11
2. Maven at-least version 3.6.3 
3. Internet connection, with nonblocking access to repo.maven.apache.org or access to private maven repository
4. Provided `eureka-server` is up and running 

### To start this car data service ###

To start this service please execute following maven command inside this project under folder(car-data-service) having `pom.xml`;

`mvn clean install spring-boot:run` 

### API Gateway ###

`http://localhost:8761/` in your web browser and you can find the Eureka Server running on the port 8761

Example Standalone API EndPoint is 

`http://localhost:8081/api/v1/cars`

`http://localhost:8081/api/v1/customers`