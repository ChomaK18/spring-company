package com.learning.Company.service.impl;

import com.learning.Company.entity.EmployeeEntity;
import com.learning.Company.mapper.EmployeeMapper;
import com.learning.Company.repository.EmployeeRepository;
import com.learning.Company.service.EmployeeService;
import com.learning.Company.to.EmployeeTo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private EmployeeMapper employeeMapper;

    public EmplyeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }


    @Override
    public List<EmployeeTo> findAllEmployees() {
        return this.employeeMapper.map2Tos(this.employeeRepository.findAll());
    }

    @Override
    public EmployeeTo findEmployeeById(Long id) {
        return this.employeeRepository.findById(id)
                .map(employee -> this.employeeMapper.map2To(employee))
                .orElseThrow(() -> new RuntimeException("Couldn't find book with ID" + id));
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
