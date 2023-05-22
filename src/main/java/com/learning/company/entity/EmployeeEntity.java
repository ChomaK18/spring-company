package com.learning.company.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EmployeeEntity {
    @Id
    @GeneratedValue()
    private Long id;
    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity employeeEntity = (EmployeeEntity) o;
        return Objects.equals(id, employeeEntity.id) && Objects.equals(name, employeeEntity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
