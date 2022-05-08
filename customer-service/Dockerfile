FROM openjdk:11

LABEL org.opencontainers.image.authors="vikram.boyapati1@gmail.com"

ADD target/*.jar customer-service.jar

EXPOSE 8083
ENTRYPOINT ["java", "-jar", "/customer-service.jar"]