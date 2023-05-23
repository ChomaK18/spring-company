package com.learning.company.rest.controller;

import com.learning.company.service.EmployeeService;
import com.learning.company.to.ActiveEmployeeTo;
import com.learning.company.to.EmployeeTo;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class EmployeesController {

    private final EmployeeService employeeService;

    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/employees")
    public Set<EmployeeTo> showAllEmployees() {
        return this.employeeService.findAllEmployees();
    }

    @GetMapping(value = "/active-employees")
    public Set<EmployeeTo> showAllActiveEmployees() {
        return this.employeeService.findAllActiveEmployees();
    }

    @PostMapping(value = "/employee/delete/{id}")
    public void deleteEmployee(@PathVariable("id") Long employeeId) {
        this.employeeService.deleteEmployee(employeeId);
    }

    @PostMapping(value = "/employee/save")
    public EmployeeTo saveEmployee(@RequestBody EmployeeTo employee) {
        return this.employeeService.saveEmployee(employee);
    }

    @PostMapping(value = "/active-employee/save")
    public ActiveEmployeeTo saveEmployee(@RequestBody ActiveEmployeeTo employee) {
        return (ActiveEmployeeTo) this.employeeService.saveEmployee(employee);
    }

}
