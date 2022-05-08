## Summary ##

This service contains APIs to read, add, change, and delete the attributes of Car

For now following basic customer attributes supported:

* Make
* Model
* Version
* Number of doors
* CO2-emission
* Gross price
* Net price

### Prerequisite ###

1. Java 11
2. Maven at-least version 3.6.3 
3. Internet connection, with nonblocking access to repo.maven.apache.org or access to private maven repository
4. Provided `eureka-server` is up and running 

### To start this car data service ###

To start this service please execute following maven command inside this project under folder(car-data-service) having `pom.xml`;

`mvn clean install spring-boot:run` 

### Car Data API ###

`/car-data-service/api` is mapped to the CAR-DATA-SERVICE, AUTH-SERVICE dynamically routes the requests to the respective backend application.
You can find the API swagger documentation in `http://localhost:8082/swagger-ui/`

`http://localhost:8761/` in your web browser and you can find the Eureka Server running on the port 8761

Example Standalone API EndPoint is `http://localhost:8083/api/v1/cars`