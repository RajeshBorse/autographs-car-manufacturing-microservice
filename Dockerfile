FROM openjdk:15
ADD target/autographs-car-manufacturing-microservice.jar autographs-car-manufacturing-microservice.jar
ENTRYPOINT [ "java", "-jar",  "autographs-car-manufacturing-microservice.jar"]
EXPOSE 8003