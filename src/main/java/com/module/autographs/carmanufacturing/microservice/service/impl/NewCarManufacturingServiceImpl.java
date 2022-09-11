package com.module.autographs.carmanufacturing.microservice.service.impl;

import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingDataModel;
import com.module.autographs.carmanufacturing.microservice.service.NewCarManufacturingService;
import com.module.autographs.carmanufacturing.microservice.repository.NewCarManufacturingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewCarManufacturingServiceImpl implements NewCarManufacturingService {

    @Autowired
    NewCarManufacturingRepository newCarManufacturingRepository;

    @Override
    public List<NewCarManufacturingDataModel> findAll() {
        return newCarManufacturingRepository.findAll();
    }

    @Override
    public List<NewCarManufacturingDataModel> addNewCarManufacturingData(List<NewCarManufacturingDataModel> newCarManufacturingDataModelList) {
        return newCarManufacturingRepository.saveAll(newCarManufacturingDataModelList);
    }

    public List<NewCarManufacturingDataModel> findAllNewCarManufacturing(String type) {
        List<NewCarManufacturingDataModel> newCarManufacturingDataModelList = newCarManufacturingRepository.findAllCarManufacturingByType(type);
        return newCarManufacturingDataModelList;
    }

}