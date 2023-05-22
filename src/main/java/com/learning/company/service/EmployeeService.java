package com.learning.company.service;

import com.learning.company.to.ActiveEmployeeTo;
import com.learning.company.to.EmployeeTo;
import com.learning.company.to.InactiveEmployeeTo;

import java.util.Set;

public interface EmployeeService {

    Set<EmployeeTo> findAllEmployees();

    Set<EmployeeTo> findAllActiveEmployees();

    EmployeeTo findEmployeeById(Long id);

    EmployeeTo saveEmployee(EmployeeTo inactiveEmployeeTo);

    void deleteEmployee(Long id);

}
