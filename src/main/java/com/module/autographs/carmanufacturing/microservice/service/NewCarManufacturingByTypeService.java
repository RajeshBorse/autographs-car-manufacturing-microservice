package com.module.autographs.carmanufacturing.microservice.service;

import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingByTypeDataModel;

import java.util.List;

public interface NewCarManufacturingByTypeService {

    List<NewCarManufacturingByTypeDataModel> findAll();

    List<NewCarManufacturingByTypeDataModel> addNewCarManufacturingByTypeData(List<NewCarManufacturingByTypeDataModel> newCarManufacturingByTypeDataModelList);

    List<NewCarManufacturingByTypeDataModel> findAllNewCarManufacturingByTypeByType(String type);
}