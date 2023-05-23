package com.learning.company.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@DiscriminatorValue("activeEmployee")
public class ActiveEmployeeEntity extends EmployeeEntity {

    @Column
    private Double salary;
    @Column
    private LocalDate dateEmployment;

    public ActiveEmployeeEntity() {
    }

    public ActiveEmployeeEntity(Long id, String name, Double salary, LocalDate dateEmployment) {
        super(id, name);
        this.salary = salary;
        this.dateEmployment = dateEmployment;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getDateEmployment() {
        return dateEmployment;
    }

    public void setDateEmployment(LocalDate dateEmployment) {
        this.dateEmployment = dateEmployment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ActiveEmployeeEntity that = (ActiveEmployeeEntity) o;
        return Objects.equals(salary, that.salary) && Objects.equals(dateEmployment, that.dateEmployment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, dateEmployment);
    }
}
