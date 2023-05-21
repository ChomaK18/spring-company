package com.learning.Company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class ActiveEmployeeEntity extends EmployeeEntity {

    @Column(name = "SALARY")
    private Double salary;
    @Column(name = "DATE_EMPLOYMENT")
    private LocalDate dateEmployment;

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
