package com.hibernate.types.app.sample.infrastructure.repository;

import com.hibernate.types.app.sample.domain.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository  extends JpaRepository<Sample, Integer> {
}
