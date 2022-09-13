package com.module.autographs.carmanufacturing.microservice.controller;

import com.module.autographs.carmanufacturing.microservice.AutographsCarManufacturingApplication;
import com.module.autographs.carmanufacturing.microservice.dto.NewCarManufacturingByTypeDTO;
import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingByTypeDataModel;
import com.module.autographs.carmanufacturing.microservice.repository.NewCarManufacturingByTypeRepository;
import com.module.autographs.carmanufacturing.microservice.service.NewCarManufacturingByTypeService;
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
@Tag(name = "NewCarManufacturingByTypeRestController")

public class NewCarManufacturingByTypeRestController {


    @Autowired
    private NewCarManufacturingByTypeService newCarManufacturingByTypeService;

    @Autowired
    private NewCarManufacturingByTypeRepository newCarManufacturingByTypeRepository;

    private static final Logger logger = LogManager.getLogger(AutographsCarManufacturingApplication.class);

    @GetMapping(value = GET_API_PATH_BY_TYPE)
    @Operation(summary = SWAGGER_GET_API_BY_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_GET_API_BY_TYPE_SUCCESS, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewCarManufacturingByTypeDTO.class))), @ApiResponse(description = SWAGGER_GET_API_BY_TYPE_NO_DATA_FOUND, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewCarManufacturingByTypeDTO> getNewCarManufacturingByTypeData() {
        List<NewCarManufacturingByTypeDTO> newCarManufacturingByTypeDTOList = ObjectMapperUtils.mapAll(newCarManufacturingByTypeService.findAll(), NewCarManufacturingByTypeDTO.class);
        if (newCarManufacturingByTypeDTOList.size() > 0) {
            logger.info(LOGGER_GET_API_BY_TYPE_SUCCESS);

            return ResponseEntity.ok(newCarManufacturingByTypeDTOList).getBody();
        } else {
            logger.info(LOGGER_GET_API_BY_TYPE_FAILURE);

            throw new ResponseStatusException(HttpStatus.OK, SWAGGER_GET_API_BY_TYPE_NO_DATA_FOUND);
        }
    }


    @PostMapping(value = POST_API_PATH_BY_TYPE)
    @Operation(summary = SWAGGER_POST_API_BY_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_POST_API_BY_TYPE_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCarManufacturingByTypeDTO.class))), @ApiResponse(description = SWAGGER_POST_API_BY_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addNewCarManufacturingByTypeData(@RequestBody List<NewCarManufacturingByTypeDTO> NewCarManufacturingByTypeDTOList) {
        List<NewCarManufacturingByTypeDataModel> newCarManufacturingByTypeDataModelList = newCarManufacturingByTypeService.addNewCarManufacturingByTypeData(ObjectMapperUtils.mapAll(NewCarManufacturingByTypeDTOList, NewCarManufacturingByTypeDataModel.class));
        if (newCarManufacturingByTypeDataModelList.size() > 0) {
            logger.info(LOGGER_POST_API_BY_TYPE_SUCCESS);
            return ResponseEntity.ok(SWAGGER_POST_API_BY_TYPE_SUCCESS);
        } else {
            logger.info(LOGGER_POST_API_BY_TYPE_FAILURE);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, SWAGGER_POST_API_BY_TYPE_FAILURE);
        }
    }

    @DeleteMapping(value = DELETE_API_PATH_BY_TYPE)
    @Operation(summary = SWAGGER_DELETE_API_BY_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_DELETE_API_BY_TYPE_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCarManufacturingByTypeDTO.class))), @ApiResponse(description = SWAGGER_DELETE_API_BY_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllNewCarManufacturingByTypeData() {
        logger.info(LOGGER_DELETE_API_BY_TYPE_SUCCESS);
        newCarManufacturingByTypeRepository.deleteAll();
        return ResponseEntity.ok(SWAGGER_DELETE_API_BY_TYPE_SUCCESS);
    }

}
