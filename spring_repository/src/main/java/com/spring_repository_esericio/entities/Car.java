package com.spring_repository_esericio.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Car {
    // parameters
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   @Column(nullable = false)
    private String modelName;
   @Column(nullable = false)
    private Long serialNumber;
    private Double currentPrice;

    // empty constructor
    public Car(){

    }

    // constructor with all the parameters
    public Car(Long id, String modelName, Long serialNumber, Double currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
