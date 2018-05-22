package com.hibernate.types.app.sample.domain.model;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity(name = "sample")
@Table(name = "sample")
public class Sample extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Set<Exam> exams;

    public Sample() {
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
