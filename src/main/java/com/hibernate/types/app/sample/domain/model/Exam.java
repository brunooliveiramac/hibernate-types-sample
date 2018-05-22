package com.hibernate.types.app.sample.domain.model;

import java.io.Serializable;

public class Exam implements Serializable {


    private Integer id;

    private String name;

    public Exam() {
    }

    public Exam(String name) {
        this.name = name;
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
