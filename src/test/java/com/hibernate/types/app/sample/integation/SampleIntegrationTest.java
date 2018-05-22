package com.hibernate.types.app.sample.integation;


import com.hibernate.types.app.sample.domain.model.Exam;
import com.hibernate.types.app.sample.domain.model.Sample;
import com.hibernate.types.app.sample.infrastructure.repository.SampleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.Arrays;

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
        sample.setExams(Arrays.asList(new Exam("TSH")));
        sampleRepository.save(sample);
    }

    @Test
    public void should_retrieve_samples() {
        Sample found_1 = entityManager.find(Sample.class, 6L);
        System.out.println(found_1.getExams());
        assertNotNull(found_1.getExams());
    }
}
