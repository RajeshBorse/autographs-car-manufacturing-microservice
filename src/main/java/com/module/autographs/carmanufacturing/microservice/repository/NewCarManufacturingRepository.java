package com.module.autographs.carmanufacturing.microservice.repository;

import com.module.autographs.carmanufacturing.microservice.model.NewCarManufacturingDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface NewCarManufacturingRepository extends MongoRepository<NewCarManufacturingDataModel, String> {

    @Query("{type:'?0'}")
    List<NewCarManufacturingDataModel> findAllCarManufacturingByType(String type);
}