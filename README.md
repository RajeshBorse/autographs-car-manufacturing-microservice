# University of Leicester - Masters Project

Autographs is an application designed and developed as a part of an academic project for the year 2021/22. This is designed and developed by Rajesh Borse (rsb34)

## Requirements
As per the project requirements, we are expected to display the cloud-based data in the form of charts to android mobile users.

## Microservice

Autographs Car Manufacturing Microservice - This is a spring-boot java microservice which has RESTful APIs which will be used by the android mobile application for displaying the charts in the frontend systems based on the service response.

Below are the services that this microservice serves.

- New CAR Manufacturing.
- New CAR Manufacturing by Type.

Below are the endpoints that are exposed by this microservice.

## New CAR Manufacturing

- GET API Endpoint - Used for fetching all the CAR Manufacturing data from the MongoDB database.


```bash
/api/v1/newCarManufacturing/getAllNewCarManufacturingData
```

- POST API Endpoint - Used for inserting all the CAR Manufacturing data in the MongoDB database.

```bash
/api/v1/newCarManufacturing/addNewCarManufacturingData
```

- DELETE API Endpoint - Used for deleting all the CAR Manufacturing in the MongoDB database.
```bash
/api/v1/newCarManufacturing/deleteAllNewCarManufacturingData
```

## New CAR Manufacturing By Type

- GET API Endpoint - Used for fetching all the CAR Manufacturing by Type data from the MongoDB database.

```bash
/api/v1/newCarManufacturing/getAllNewCarManufacturingByTypeData
```

- POST API Endpoint - Used for inserting all the CAR Manufacturing by Type data in the MongoDB database.

```bash
/api/v1/newCarManufacturing/addNewCarManufacturingByTypeData
```

- DELETE API Endpoint - Used for deleting all the CAR Manufacturing by Type data in the MongoDB database.
```bash
/api/v1/newCarManufacturing/deleteAllNewCarManufacturingByTypeData
```
