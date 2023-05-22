package com.learning.company.to;

import java.time.LocalDate;

public class ActiveEmployeeTo extends EmployeeTo {

    private Double salary;
    private LocalDate dateEmployment;

    public ActiveEmployeeTo() {
        super();
    }

    public ActiveEmployeeTo(Long id, String name, Double salary, LocalDate dateEmployment) {
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
}
