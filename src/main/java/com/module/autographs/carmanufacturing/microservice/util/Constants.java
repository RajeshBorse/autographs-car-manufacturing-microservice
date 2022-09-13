package com.module.autographs.carmanufacturing.microservice.util;

public class Constants {

    // HTTP STATUS CODES
    public static final String HTTP_RESPONSE_CODE_OK = "200";
    public static final String HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR = "500";

    // ALL API PATHS

    // 1 - NEW CAR MANUFACTURING
    public static final String GET_API_PATH = "/getAllNewCarManufacturingData";
    public static final String POST_API_PATH = "/addNewCarManufacturingData";
    public static final String DELETE_ALL_API_PATH = "/deleteAllNewCarManufacturingData";

    // 2 - NEW CAR MANUFACTURING BY TYPE
    public static final String GET_API_PATH_BY_TYPE = "/getAllNewCarManufacturingByTypeData";
    public static final String POST_API_PATH_BY_TYPE = "/addNewCarManufacturingByTypeData";
    public static final String DELETE_API_PATH_BY_TYPE = "/deleteAllNewCarManufacturingByTypeData";


    // ALL SWAGGER CONSTANTS BELOW ---------------------------------------------------------------------------------------------------------

    // 1 - NEW CAR MANUFACTURING
    // GET API
    public static final String SWAGGER_GET_API_SUMMARY = "GET - NEW CAR MANUFACTURING DATA";
    public static final String SWAGGER_GET_API_SUCCESS = "NEW CAR MANUFACTURING DATA FETCHED SUCCESSFULLY.";
    public static final String SWAGGER_GET_API_NO_DATA_FOUND = "NO DATA FOUND FOR NEW CAR MANUFACTURING.";
    // POST API
    public static final String SWAGGER_POST_API_SUMMARY = "POST - ADD NEW CAR MANUFACTURING";
    public static final String SWAGGER_POST_API_SUCCESS = "NEW CAR MANUFACTURING DATA ADDED SUCCESSFULLY.";
    public static final String SWAGGER_POST_API_FAILURE = "FAILURE OCCURRED WHILE ADDING NEW CAR MANUFACTURING DATA.";
    // DELETE API
    public static final String SWAGGER_DELETE_API_SUMMARY = "DELETE ALL - NEW CAR MANUFACTURING DATA";
    public static final String SWAGGER_DELETE_API_SUCCESS = "NEW CAR MANUFACTURING DATA DELETED SUCCESSFULLY.";
    public static final String SWAGGER_DELETE_API_FAILURE = "FAILURE OCCURRED WHILE DELETING NEW CAR MANUFACTURING DATA.";

    // 2 - NEW CAR MANUFACTURING BY TYPE
    // GET API
    public static final String SWAGGER_GET_API_BY_TYPE_SUMMARY = "GET - NEW CAR MANUFACTURING BY TYPE DATA";
    public static final String SWAGGER_GET_API_BY_TYPE_SUCCESS = "NEW CAR MANUFACTURING BY TYPE DATA FETCHED SUCCESSFULLY.";
    public static final String SWAGGER_GET_API_BY_TYPE_NO_DATA_FOUND = "NO DATA FOUND FOR NEW CAR MANUFACTURING BY TYPE.";
    // POST API
    public static final String SWAGGER_POST_API_BY_TYPE_SUMMARY = "POST - ADD NEW CAR MANUFACTURING BY TYPE";
    public static final String SWAGGER_POST_API_BY_TYPE_SUCCESS = "NEW CAR MANUFACTURING DATA BY TYPE ADDED SUCCESSFULLY.";
    public static final String SWAGGER_POST_API_BY_TYPE_FAILURE = "FAILURE OCCURRED WHILE ADDING NEW CAR MANUFACTURING BY TYPE DATA.";
    // DELETE API
    public static final String SWAGGER_DELETE_API_BY_TYPE_SUMMARY = "DELETE ALL - NEW CAR MANUFACTURING BY TYPE  DATA";
    public static final String SWAGGER_DELETE_API_BY_TYPE_SUCCESS = "NEW CAR MANUFACTURING BY TYPE DATA DELETED SUCCESSFULLY.";
    public static final String SWAGGER_DELETE_API_BY_TYPE_FAILURE = "FAILURE OCCURRED WHILE DELETING NEW CAR MANUFACTURING BY TYPE DATA.";


    // LOGGER CONSTANTS ---------------------------------------------------
    public static final String LOGGER_GET_API_SUCCESS = "NewCarManufacturingRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_FAILURE = "NewCarManufacturingRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_SUCCESS = "NewCarManufacturingRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_FAILURE = "NewCarManufacturingRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_SUCCESS = "NewCarManufacturingRestController : LOGGER : DELETE API : Data Deleting Success";

    public static final String LOGGER_GET_API_BY_TYPE_SUCCESS = "NewCarManufacturingByTypeRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_BY_TYPE_FAILURE = "NewCarManufacturingByTypeRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_BY_TYPE_SUCCESS = "NewCarManufacturingByTypeRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_BY_TYPE_FAILURE = "NewCarManufacturingByTypeRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_BY_TYPE_SUCCESS = "NewCarManufacturingByTypeRestController : LOGGER : DELETE API : Data Deleting Success";

}
