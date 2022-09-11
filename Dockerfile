FROM --platform=linux/amd64 openjdk:15
COPY  target/autographs-car-manufacturing-microservice.jar autographs-car-manufacturing-microservice.jar
ENTRYPOINT [ "java", "-jar",  "autographs-car-manufacturing-microservice.jar"]
EXPOSE 8003