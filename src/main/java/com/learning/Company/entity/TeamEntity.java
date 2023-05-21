package com.learning.Company.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "TEAM")
public class TeamEntity {

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TEAM_TO_EMPLOYEE",
            joinColumns = @JoinColumn(name = "TEAM_NAME"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))
    private Set<EmployeeEntity> employeeEntities;

    public TeamEntity() {
    }

    public TeamEntity(String name, Set<EmployeeEntity> employeeEntities) {
        this.name = name;
        this.employeeEntities = employeeEntities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<EmployeeEntity> getEmployees() {
        return employeeEntities;
    }

    public void setEmployees(Set<EmployeeEntity> employeeEntities) {
        this.employeeEntities = employeeEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamEntity teamEntity = (TeamEntity) o;
        return Objects.equals(name, teamEntity.name) && Objects.equals(employeeEntities, teamEntity.employeeEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeEntities);
    }
}
