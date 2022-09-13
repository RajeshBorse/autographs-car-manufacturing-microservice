package com.module.autographs.carmanufacturing.microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "byTypeCollection")
public class NewCarManufacturingByTypeDataModel {

    @Id
    private String id;
    private String year;
    private String month;
    private String type;
    private String newCarManufacturingByTypeCount;

    private String percentage;


    public NewCarManufacturingByTypeDataModel() {
    }

    public NewCarManufacturingByTypeDataModel(String id, String year, String month, String type, String newCarManufacturingByTypeCount, String percentage) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.type = type;
        this.newCarManufacturingByTypeCount = newCarManufacturingByTypeCount;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "NewCarManufacturingByTypeDataModel{" +
                "id='" + id + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", type='" + type + '\'' +
                ", newCarManufacturingByTypeCount='" + newCarManufacturingByTypeCount + '\'' +
                ", percentage='" + percentage + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNewCarManufacturingByTypeCount() {
        return newCarManufacturingByTypeCount;
    }

    public void setNewCarManufacturingByTypeCount(String newCarManufacturingByTypeCount) {
        this.newCarManufacturingByTypeCount = newCarManufacturingByTypeCount;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}