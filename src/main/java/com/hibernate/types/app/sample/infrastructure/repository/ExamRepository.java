package com.hibernate.types.app.sample.infrastructure.repository;

import com.hibernate.types.app.sample.domain.model.ExamOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends CrudRepository<ExamOrder, Integer> {
}
