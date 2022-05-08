## Summary ##

This service contains APIs to read, add, change, and delete the attributes of Customers

For now following basic customer attributes supported:

* Name
* Street
* House number
* Zip code
* Place
* Email address
* Phone number

### Prerequisite ###

1. Java 11
2. Maven at-least version 3.6.3 
3. Internet connection, with nonblocking access to repo.maven.apache.org or access to private maven repository
4. Provided `eureka-server` is up and running 

### To start this customer service ###

To start this service please execute following maven command inside this project under folder(customer-service) having `pom.xml`;

`mvn clean install spring-boot:run` 

### Customer API ###

/customer-service/api is mapped to the CUSTOMER-SERVICE
You can find the API swagger documentation in `http://localhost:8083/swagger-ui/`

`http://localhost:8761/` in your web browser and you can find the Eureka Server running on the port 8761

Example Standalone API EndPoint is `http://localhost:8082/api/v1/customers/`
