package com.learning.Company.repository;

import com.learning.Company.entity.ActiveEmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiveEmployeeRepository extends JpaRepository<ActiveEmployeeEntity, Long> {
}
