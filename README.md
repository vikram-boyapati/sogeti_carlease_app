## Summary ##

This is a sample Car-lease Platform APP is a REST API that allows to maintain vehicle versions, customers and 
other data needed to service a broker

## Current solution overview ##

This solution contains following services;

- **eureka-server** - server for Service Discovery.

- **car-data-service** - microservice for car data management.

- **customer-service** - microservice for customer management.

- **lease-rate** - microservice for calculation of lease rate.

- **cloud-gateway-service** - microservice for wrapping all the services with API gateway.

- Docker image for Containerisation of current solution.

### Prerequisite ###

1. Java 11
2. Maven at-least version 3.8.5
3. Internet connection, with nonblocking access to repo.maven.apache.org or access to private maven repository

### To run this application in prod profile ###

Build the solution from root folder using following command.

`mvn clean install`

Run with existing docker images

`docker-compose up`

If you want to change anything on any service(s), you need to build the service(s) you changed and then :

`docker-compose build`

`docker-compose up`

To stop the services

`docker-compose down`

For redeploying specific service

`docker-compose stop -t 1 service_name`

`docker-compose build service_name`

`docker-compose up --no-start service_name`

`docker-compose start service_name`

### Open Known Pending Action Items ###

1. Authentication microservice for API access, that is for identity management. 
2. Authorization microservice for API access, that is specific type of access management. Hint - Use oauth/jwt
3. Improve unit test case coverage of existing microservices
4. Store the data in a persistent datastore
5. Verification services deployed using docker image of this platform
