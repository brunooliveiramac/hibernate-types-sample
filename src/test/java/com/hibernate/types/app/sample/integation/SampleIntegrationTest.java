package com.hibernate.types.app.sample.integation;


import com.hibernate.types.app.sample.domain.model.Exam;
import com.hibernate.types.app.sample.domain.model.Material;
import com.hibernate.types.app.sample.domain.model.Sample;
import com.hibernate.types.app.sample.infrastructure.repository.SampleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleIntegrationTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private SampleRepository sampleRepository;


    @Test
    public void should_save_samples() {
        Sample sample = new Sample();
        HashSet<Exam> exams = new HashSet<>();
        exams.add(new Exam(1,"TSH"));
        exams.add(new Exam(2,"TSH"));
        exams.add(new Exam(3,"CULT"));
        exams.add(new Exam(3,"CULT", new Material("Batata")));
        sample.setExams(exams);
        sampleRepository.save(sample);
    }

    @Test
    public void should_retrieve_samples() {
        Sample found_1 = entityManager.find(Sample.class, 10L);
        System.out.println(found_1.getExams());
        assertNotNull(found_1.getExams());
    }
}
