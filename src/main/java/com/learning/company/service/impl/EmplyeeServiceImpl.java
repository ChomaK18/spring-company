package com.learning.company.service.impl;

import com.learning.company.entity.EmployeeEntity;
import com.learning.company.mapper.EmployeeMapper;
import com.learning.company.repository.EmployeeRepository;
import com.learning.company.service.EmployeeService;
import com.learning.company.to.ActiveEmployeeTo;
import com.learning.company.to.EmployeeTo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private EmployeeMapper<EmployeeTo, EmployeeEntity> employeeMapper;

    public EmplyeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper<EmployeeTo, EmployeeEntity> employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }


    @Override
    public Set<EmployeeTo> findAllEmployees() {
        return this.employeeMapper.map2Tos(new HashSet<>(this.employeeRepository.findAll()));
    }

    @Override
    public Set<EmployeeTo> findAllActiveEmployees() {
        return this.findAllEmployees().stream().filter(employeeTo -> employeeTo instanceof ActiveEmployeeTo).collect(Collectors.toSet());
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
