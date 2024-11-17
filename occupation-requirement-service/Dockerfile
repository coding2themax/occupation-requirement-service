#FROM maven:3.8.5-openjdk-23

#ADD pom.xml /
#RUN mvn verify clean

#ADD . /
#RUN mvn install -Dmaven.test.skip


# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:23-jdk-alpine


# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file to the container
COPY target/*jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]