FROM maven:3.9-eclipse-temurin-22 AS build

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:22-ea-slim-bullseye

COPY --from=build /usr/src/app/target/junittesting-1.0-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "junittesting-1.0-SNAPSHOT.jar"]