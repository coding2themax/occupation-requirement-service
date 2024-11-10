# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:23-jdk-alpine


# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file to the container
COPY occupation-requirement-service/target/occupation-requirement-service-1.0.0.jar /app/occupation-requirement-service.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "occupation-requirement-service.jar"]