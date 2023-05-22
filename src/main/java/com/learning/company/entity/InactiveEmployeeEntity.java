package com.learning.company.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("INACTIVE")
public class InactiveEmployeeEntity extends EmployeeEntity {

    public InactiveEmployeeEntity(Long id, String name) {
        super(id, name);
    }
}
