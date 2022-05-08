FROM openjdk:11

LABEL org.opencontainers.image.authors="vikram.boyapati1@gmail.com"

ADD target/*.jar lease-rate.jar

EXPOSE 8084
ENTRYPOINT ["java", "-jar", "/lease-rate.jar"]