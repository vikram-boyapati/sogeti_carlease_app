FROM openjdk:11

LABEL org.opencontainers.image.authors="vikram.boyapati1@gmail.com"

ADD target/*.jar car-data-service.jar

EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/car-data-service.jar"]