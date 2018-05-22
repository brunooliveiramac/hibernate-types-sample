package com.hibernate.types.app.sample.domain.model;

import java.io.Serializable;

public class Material implements Serializable {


    private String name;

    public Material() {
    }

    public Material(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
