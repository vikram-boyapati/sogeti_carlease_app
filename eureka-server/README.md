## Summary ##

This platform implements a Service Discovery using Netflix server implementation: [Eureka] (https://github.com/Netflix/eureka).

It uses [Spring Boot](http://projects.spring.io/spring-boot/) to start Spring context and run the application and [Spring Cloud Eureka](https://cloud.spring.io/spring-cloud-netflix/) to integrate Netflix implementation into Spring.

### To start this Eureka service ###

To start this service please execute following maven command inside this project under folder(eureka-server)having `pom.xml`;

`mvn clean install spring-boot:run` 

### Eureka Spring Server ###

The Eureka server can be reached at `http://localhost:8761`

