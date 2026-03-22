FROM maven:3.9.9-eclipse-temurin-22 AS build

WORKDIR /app

COPY target/cms-springboot-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]