package com.module.autographs.carmanufacturing.microservice.service;

import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingDataModel;

import java.util.List;

public interface NewCarManufacturingService {

    List<NewCarManufacturingDataModel> findAll();

    List<NewCarManufacturingDataModel> addNewCarManufacturingData(List<NewCarManufacturingDataModel> newCarManufacturingDataModelList);

    List<NewCarManufacturingDataModel> findAllNewCarManufacturing(String type);
}
