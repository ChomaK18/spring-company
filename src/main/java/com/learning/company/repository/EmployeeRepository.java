package com.learning.company.repository;

import com.learning.company.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    @Query("SELECT em FROM EmployeeEntity as em WHERE TYPE(em)='activeEmployee'")
    Set<EmployeeEntity> findAllActiveEmployees();

}
