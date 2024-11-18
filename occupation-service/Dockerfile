# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:23-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file into the container
COPY target/*.jar app.jar

# Expose the port that the application will run on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]