FROM openjdk:11

LABEL org.opencontainers.image.authors="vikram.boyapati1@gmail.com"

ADD target/*.jar cloud-gateway-service.jar

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/cloud-gateway-service.jar"]