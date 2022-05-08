FROM openjdk:11

LABEL org.opencontainers.image.authors="vikram.boyapati1@gmail.com"

ADD target/*.jar eureka-server.jar

EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/eureka-server.jar"]