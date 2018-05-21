package com.hibernate.types.app.sample.integation;


import com.hibernate.types.app.sample.domain.model.ExamOrder;
import com.hibernate.types.app.sample.domain.model.Sample;
import com.hibernate.types.app.sample.infrastructure.repository.SampleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

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
        sample.setExams(new ExamOrder("TSH"));
        sampleRepository.save(sample);
    }
}
