package com.learning.company.to;

import java.util.Set;

public class TeamTo {

    private String name;
    private Set<EmployeeTo> employees;

    public TeamTo(String name, Set<EmployeeTo> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<EmployeeTo> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<EmployeeTo> employees) {
        this.employees = employees;
    }
}
