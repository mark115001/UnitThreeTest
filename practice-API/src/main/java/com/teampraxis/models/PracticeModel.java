package com.teampraxis.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PracticeModel {

    @Id
    @GeneratedValue
    private Long id;

    private String dogType;

    private String dogName;

    public PracticeModel() {
    }

    public PracticeModel(String dogType, String dogName) {
        this.dogType = dogType;
        this.dogName = dogName;
    }

    public Long getId() {
        return id;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }


}
