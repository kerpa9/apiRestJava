package com.kevenreyes.apirest.apirest.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Brand;
    private int Model;
    private String Origin;

    public Long getId() {
        return id;
    }
    public String getBrand() {
        return Brand;
    }
    public int getModel() {
        return Model;
    }
    public String getOrigin() {
        return Origin;
    }

    public void setId(Long id){
        this.id=id;
    }
    public void setBrand(String Brand){
        this.Brand=Brand;
    }
    public void setModel(int Model){
        this.Model=Model;
    }
    public void setOrigin(String Origin){
        this.Origin=Origin;
    }

}
