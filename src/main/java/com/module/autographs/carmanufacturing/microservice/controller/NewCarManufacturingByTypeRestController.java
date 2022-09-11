package com.module.autographs.carmanufacturing.microservice.controller;

import com.module.autographs.carmanufacturing.microservice.dto.NewCarManufacturingByTypeDTO;
import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingByTypeDataModel;
import com.module.autographs.carmanufacturing.microservice.service.NewCarManufacturingByTypeService;
import com.module.autographs.carmanufacturing.microservice.util.Constants;
import com.module.autographs.carmanufacturing.microservice.util.ObjectMapperUtils;
import com.module.autographs.carmanufacturing.microservice.repository.NewCarManufacturingByTypeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/newCarManufacturing")
@Tag(name = "NewCarManufacturing")

public class NewCarManufacturingByTypeRestController {


    @Autowired
    private NewCarManufacturingByTypeService newCarManufacturingByTypeService;

    @Autowired
    private NewCarManufacturingByTypeRepository newCarManufacturingByTypeRepository;

    @GetMapping(value = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_GET_API_PATH)
    @Operation(summary = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_GET_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_SUCCESS, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewCarManufacturingByTypeDTO.class))), @ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_NO_DATA_FOUND, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewCarManufacturingByTypeDTO> getNewCarManufacturingByTypeData() {
        List<NewCarManufacturingByTypeDTO> newCarManufacturingByTypeDTOList = ObjectMapperUtils.mapAll(newCarManufacturingByTypeService.findAll(), NewCarManufacturingByTypeDTO.class);
        if (newCarManufacturingByTypeDTOList.size() > 0) {
            return ResponseEntity.ok(newCarManufacturingByTypeDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, Constants.NEW_CAR_MANUFACTURING_BY_TYPE_NO_DATA_FOUND);
        }
    }


    @PostMapping(value = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_POST_API_PATH)
    @Operation(summary = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_POST_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_ADD_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCarManufacturingByTypeDTO.class))), @ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_ADD_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addNewCarManufacturingByTypeData(@RequestBody List<NewCarManufacturingByTypeDTO> NewCarManufacturingByTypeDTOList) {
        List<NewCarManufacturingByTypeDataModel> newCarManufacturingByTypeDataModelList = newCarManufacturingByTypeService.addNewCarManufacturingByTypeData(ObjectMapperUtils.mapAll(NewCarManufacturingByTypeDTOList, NewCarManufacturingByTypeDataModel.class));
        if (newCarManufacturingByTypeDataModelList.size() > 0) {
            return ResponseEntity.ok(Constants.NEW_CAR_MANUFACTURING_BY_TYPE_ADD_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.NEW_CAR_MANUFACTURING_BY_TYPE_ADD_FAILURE);
        }
    }

    @DeleteMapping(value = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_DELETE_ALL_API_PATH)
    @Operation(summary = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_DELETE_ALL_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_DELETE_ALL_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCarManufacturingByTypeDTO.class))), @ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_BY_TYPE_DELETE_ALL_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllNewCarManufacturingByTypeData() {
        newCarManufacturingByTypeRepository.deleteAll();
        return ResponseEntity.ok(Constants.NEW_CAR_MANUFACTURING_BY_TYPE_DELETE_ALL_SUCCESS);
    }

}
