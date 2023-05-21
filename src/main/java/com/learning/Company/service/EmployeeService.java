package com.learning.Company.service;

import com.learning.Company.to.EmployeeTo;

import java.util.List;

public interface EmployeeService {

    List<EmployeeTo> findAllEmployees();

    EmployeeTo findEmployeeById(Long id);

    EmployeeTo saveEmployee(EmployeeTo employeeTo);

    void deleteEmployee(Long id);

}
