package com.learning.company.entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class TeamEntity {

    @Id
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TEAM_TO_EMPLOYEE",
            joinColumns = @JoinColumn(name = "TEAM_NAME"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))
    private Set<EmployeeEntity> employeeEntityEntities;

    public TeamEntity() {
    }

    public TeamEntity(String name, Set<EmployeeEntity> employeeEntityEntities) {
        this.name = name;
        this.employeeEntityEntities = employeeEntityEntities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<EmployeeEntity> getEmployees() {
        return employeeEntityEntities;
    }

    public void setEmployees(Set<EmployeeEntity> employeeEntityEntities) {
        this.employeeEntityEntities = employeeEntityEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamEntity teamEntity = (TeamEntity) o;
        return Objects.equals(name, teamEntity.name) && Objects.equals(employeeEntityEntities, teamEntity.employeeEntityEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeEntityEntities);
    }
}
