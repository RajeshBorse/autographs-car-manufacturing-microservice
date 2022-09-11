package com.module.autographs.carmanufacturing.microservice.service.impl;

import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingByTypeDataModel;
import com.module.autographs.carmanufacturing.microservice.service.NewCarManufacturingByTypeService;
import com.module.autographs.carmanufacturing.microservice.repository.NewCarManufacturingByTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewCarManufacturingByTypeServiceImpl implements NewCarManufacturingByTypeService {

    @Autowired
    NewCarManufacturingByTypeRepository newCarManufacturingByTypeRepository;

    @Override
    public List<NewCarManufacturingByTypeDataModel> findAll() {
        return newCarManufacturingByTypeRepository.findAll();
    }

    @Override
    public List<NewCarManufacturingByTypeDataModel> addNewCarManufacturingByTypeData(List<NewCarManufacturingByTypeDataModel> newCarManufacturingByTypeDataModelList) {
        return newCarManufacturingByTypeRepository.saveAll(newCarManufacturingByTypeDataModelList);
    }

    public List<NewCarManufacturingByTypeDataModel> findAllNewCarManufacturingByTypeByType(String type) {
        List<NewCarManufacturingByTypeDataModel> newCarManufacturingByTypeDataModelList = newCarManufacturingByTypeRepository.findAllNewCarManufacturingByTypeByType(type);
        return newCarManufacturingByTypeDataModelList;
    }

}
