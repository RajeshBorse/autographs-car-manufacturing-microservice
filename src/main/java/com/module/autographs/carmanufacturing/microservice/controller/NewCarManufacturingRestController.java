package com.module.autographs.carmanufacturing.microservice.controller;

import com.module.autographs.carmanufacturing.microservice.AutographsCarManufacturingApplication;
import com.module.autographs.carmanufacturing.microservice.dto.NewCarManufacturingDTO;
import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingDataModel;
import com.module.autographs.carmanufacturing.microservice.repository.NewCarManufacturingRepository;
import com.module.autographs.carmanufacturing.microservice.service.NewCarManufacturingService;
import com.module.autographs.carmanufacturing.microservice.util.ObjectMapperUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static com.module.autographs.carmanufacturing.microservice.util.Constants.*;

@RestController
@RequestMapping("/api/v1/newCarManufacturing")
@Tag(name = "NewCarManufacturingRestController")

public class NewCarManufacturingRestController {


    @Autowired
    private NewCarManufacturingService newCarManufacturingService;

    @Autowired
    private NewCarManufacturingRepository newCarManufacturingRepository;

    private static final Logger logger = LogManager.getLogger(AutographsCarManufacturingApplication.class);

    @GetMapping(value = GET_API_PATH)
    @Operation(summary = SWAGGER_GET_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_GET_API_SUCCESS, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewCarManufacturingDTO.class))), @ApiResponse(description = SWAGGER_GET_API_NO_DATA_FOUND, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewCarManufacturingDTO> getNewCarManufacturingData() {
        List<NewCarManufacturingDTO> newCarManufacturingDTOList = ObjectMapperUtils.mapAll(newCarManufacturingService.findAll(), NewCarManufacturingDTO.class);
        if (newCarManufacturingDTOList.size() > 0) {
            logger.info(LOGGER_GET_API_SUCCESS);

            return ResponseEntity.ok(newCarManufacturingDTOList).getBody();
        } else {
            logger.info(LOGGER_GET_API_FAILURE);

            throw new ResponseStatusException(HttpStatus.OK, SWAGGER_GET_API_NO_DATA_FOUND);
        }
    }


    @PostMapping(value = POST_API_PATH)
    @Operation(summary = SWAGGER_POST_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_POST_API_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCarManufacturingDTO.class))), @ApiResponse(description = SWAGGER_POST_API_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addNewCarManufacturingData(@RequestBody List<NewCarManufacturingDTO> newCarManufacturingDTOList) {
        List<NewCarManufacturingDataModel> newCarManufacturingDataModelList = newCarManufacturingService.addNewCarManufacturingData(ObjectMapperUtils.mapAll(newCarManufacturingDTOList, NewCarManufacturingDataModel.class));
        if (newCarManufacturingDataModelList.size() > 0) {
            logger.info(LOGGER_POST_API_SUCCESS);

            return ResponseEntity.ok(SWAGGER_POST_API_SUCCESS);
        } else {
            logger.info(LOGGER_POST_API_FAILURE);

            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, SWAGGER_POST_API_FAILURE);
        }
    }

    @DeleteMapping(value = DELETE_ALL_API_PATH)
    @Operation(summary = SWAGGER_DELETE_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_DELETE_API_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCarManufacturingDTO.class))), @ApiResponse(description = SWAGGER_DELETE_API_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllNewCarManufacturingData() {
        logger.info(LOGGER_DELETE_API_SUCCESS);

        newCarManufacturingRepository.deleteAll();
        return ResponseEntity.ok(SWAGGER_DELETE_API_SUCCESS);
    }

}
