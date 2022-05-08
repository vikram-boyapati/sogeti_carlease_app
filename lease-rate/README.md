## Summary ##

This service contains APIs to calculate lease rate for Car based on the following parameters:

* Mileage - the amount of kilometers on annual base
* Duration - the number of months in the contract
* Interest rate with start date
* Net price

### Prerequisite ###

1. Java 11
2. Maven at-least version 3.6.3 
3. Internet connection, with nonblocking access to repo.maven.apache.org or access to private maven repository
4. Provided `eureka-server` is up and running 

### To start this lease rate service ###

To start this service please execute following maven command inside this project under folder having `pom.xml`;

`mvn clean install spring-boot:run` 

### Lease rate Calculation API ###

/lease-rate-service/api is mapped to the LEASE-RATE-SERVICE
You can find the API swagger documentation in `http://localhost:8084/swagger-ui/`

http://localhost:8761/ in your web browser and you can find the Eureka Server running on the port 8761

Example Standalone API EndPoint is `http://localhost:8084/api/v1/leaserate`
