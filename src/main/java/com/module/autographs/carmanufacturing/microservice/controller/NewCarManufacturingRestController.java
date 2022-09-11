package com.module.autographs.carmanufacturing.microservice.controller;

import com.module.autographs.carmanufacturing.microservice.dto.NewCarManufacturingDTO;
import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingDataModel;
import com.module.autographs.carmanufacturing.microservice.util.Constants;
import com.module.autographs.carmanufacturing.microservice.util.ObjectMapperUtils;
import com.module.autographs.carmanufacturing.microservice.repository.NewCarManufacturingRepository;
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

public class NewCarManufacturingRestController {


    @Autowired
    private com.module.autographs.carmanufacturing.microservice.service.NewCarManufacturingService NewCarManufacturingService;

    @Autowired
    private NewCarManufacturingRepository NewCarManufacturingRepository;

    @GetMapping(value = Constants.NEW_CAR_MANUFACTURING_GET_API_PATH)
    @Operation(summary = Constants.NEW_CAR_MANUFACTURING_GET_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_SUCCESS, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewCarManufacturingDTO.class))), @ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_NO_DATA_FOUND, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewCarManufacturingDTO> getNewCarManufacturingData() {
        List<NewCarManufacturingDTO> newCarManufacturingDTOList = ObjectMapperUtils.mapAll(NewCarManufacturingService.findAll(), NewCarManufacturingDTO.class);
        if (newCarManufacturingDTOList.size() > 0) {
            return ResponseEntity.ok(newCarManufacturingDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, Constants.NEW_CAR_MANUFACTURING_NO_DATA_FOUND);
        }
    }


    @PostMapping(value = Constants.NEW_CAR_MANUFACTURING_POST_API_PATH)
    @Operation(summary = Constants.NEW_CAR_MANUFACTURING_POST_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_ADD_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCarManufacturingDTO.class))), @ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_ADD_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addNewCarManufacturingData(@RequestBody List<NewCarManufacturingDTO> newCarManufacturingDTOList) {
        List<NewCarManufacturingDataModel> newCarManufacturingDataModelList = NewCarManufacturingService.addNewCarManufacturingData(ObjectMapperUtils.mapAll(newCarManufacturingDTOList, NewCarManufacturingDataModel.class));
        if (newCarManufacturingDataModelList.size() > 0) {
            return ResponseEntity.ok(Constants.NEW_CAR_MANUFACTURING_ADD_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.NEW_CAR_MANUFACTURING_ADD_FAILURE);
        }
    }

    @DeleteMapping(value = Constants.NEW_CAR_MANUFACTURING_DELETE_ALL_API_PATH)
    @Operation(summary = Constants.NEW_CAR_MANUFACTURING_DELETE_ALL_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_DELETE_ALL_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCarManufacturingDTO.class))), @ApiResponse(description = Constants.NEW_CAR_MANUFACTURING_DELETE_ALL_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllNewCarManufacturingData() {
        NewCarManufacturingRepository.deleteAll();
        return ResponseEntity.ok(Constants.NEW_CAR_MANUFACTURING_DELETE_ALL_SUCCESS);
    }

}
