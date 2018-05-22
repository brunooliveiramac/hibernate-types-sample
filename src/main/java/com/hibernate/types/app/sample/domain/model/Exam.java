package com.hibernate.types.app.sample.domain.model;

import java.io.Serializable;

public class Exam implements Serializable {


    private Integer id;

    private String name;

    private Material material;

    public Exam() {
    }

    public Exam(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Exam(Integer id, String name, Material material) {
        this.id = id;
        this.name = name;
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "ExamOrder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
