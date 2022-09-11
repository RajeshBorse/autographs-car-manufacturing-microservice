package com.module.autographs.carmanufacturing.microservice.dto;

import org.springframework.data.annotation.Id;

/**
 * rsb34
 */

public class NewCarManufacturingDTO {

    @Id
    private String id;
    private String year;
    private String month;
    private String newCarManufacturingCount;


    public NewCarManufacturingDTO() {
    }

    public NewCarManufacturingDTO(String id, String year, String month, String newCarManufacturingCount) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.newCarManufacturingCount = newCarManufacturingCount;
    }

    @Override
    public String toString() {
        return "NewCarManufacturingDTO{" + "id='" + id + '\'' + ", year='" + year + '\'' + ", month='" + month + '\'' + ", newCarManufacturingCount='" + newCarManufacturingCount + '\'' + '}';
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

    public String getNewCarManufacturingCount() {
        return newCarManufacturingCount;
    }

    public void setNewCarManufacturingCount(String newCarManufacturingCount) {
        this.newCarManufacturingCount = newCarManufacturingCount;
    }
}