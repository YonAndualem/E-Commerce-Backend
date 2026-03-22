# syntax=docker/dockerfile:1.6

FROM maven:3.9.11-eclipse-temurin-17 AS build
WORKDIR /workspace

# Copy Maven wrapper and project descriptor first for better cache reuse.
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw
RUN ./mvnw -q -DskipTests dependency:go-offline

# Copy source and build executable Spring Boot jar.
COPY src ./src
RUN ./mvnw -q -DskipTests clean package

FROM eclipse-temurin:17-jre-jammy AS runtime
WORKDIR /app

# Create a non-root user for better container security.
RUN useradd --system --create-home --uid 1001 spring

COPY --from=build /workspace/target/*.jar /app/app.jar

ENV SERVER_PORT=8080
EXPOSE 8080

USER spring
ENTRYPOINT ["java", \
  "-XX:+UseContainerSupport", \
  "-XX:MaxRAMPercentage=75.0", \
  "-XX:+ExitOnOutOfMemoryError", \
  "-jar", "/app/app.jar"]
