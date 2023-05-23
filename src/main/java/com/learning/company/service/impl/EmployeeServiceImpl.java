package com.learning.company.service.impl;

import com.learning.company.entity.EmployeeEntity;
import com.learning.company.mapper.EmployeeMapper;
import com.learning.company.repository.EmployeeRepository;
import com.learning.company.service.EmployeeService;
import com.learning.company.to.EmployeeTo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }


    @Override
    public Set<EmployeeTo> findAllEmployees() {
        return this.employeeMapper.map2Tos(new HashSet<>(this.employeeRepository.findAll()));
    }

    @Override
    public Set<EmployeeTo> findAllActiveEmployees() {
        return this.employeeMapper.map2Tos(new HashSet<>(this.employeeRepository.findAllActiveEmployees()));
    }

    @Override
    public EmployeeTo saveEmployee(EmployeeTo employeeTo) {
        EmployeeEntity employee = this.employeeMapper.map2Entity(employeeTo);
        EmployeeEntity savedEmployee = this.employeeRepository.save(employee);
        return this.employeeMapper.map2To(savedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        this.employeeRepository.deleteById(id);
    }
}
