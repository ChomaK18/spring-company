package com.learning.company.service;

import com.learning.company.to.EmployeeTo;

import java.util.Set;

public interface EmployeeService {

    Set<EmployeeTo> findAllEmployees();

    Set<EmployeeTo> findAllActiveEmployees();

    EmployeeTo saveEmployee(EmployeeTo employeeTo);

    void deleteEmployee(Long id);

}
