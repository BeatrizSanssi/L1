# Stage 1: Build the Spring Boot app
FROM gradle:8.2-jdk17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Gradle build files
COPY ./build.gradle.kts ./settings.gradle.kts ./
COPY ./gradle ./gradle
COPY ./gradlew ./gradlew
# Or for Gradle: COPY build.gradle settings.gradle . 

# Download dependencies before copying the full source
RUN ./gradlew clean bootJar --no-daemon

# Copy the source code into the container
COPY ./src /app/src

# Build the Spring Boot app
RUN ./gradlew bootJar --no-daemon

# Stage 2: Run the Spring Boot app
FROM openjdk:17-jdk

# Set the working directory
WORKDIR /app

# Copy the built JAR from the first stage
COPY --from=build /app/build/libs/L1-0.0.1-SNAPSHOT.jar app.jar

# Copy static resources from frontend into the backend container (if needed)
COPY ./express-frontend/public /app/static/

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]