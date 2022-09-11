package com.module.autographs.carmanufacturing.microservice.repository;

import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingByTypeDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface NewCarManufacturingByTypeRepository extends MongoRepository<NewCarManufacturingByTypeDataModel, String> {

    @Query("{type:'?0'}")
    List<NewCarManufacturingByTypeDataModel> findAllNewCarManufacturingByTypeByType(String type);
}