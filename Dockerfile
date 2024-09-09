# Use an official OpenJDK image as a parent image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /src

# Copy the build output (JAR file) from the local machine to the container
COPY build/libs/*.jar app.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]