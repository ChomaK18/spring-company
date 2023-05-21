package com.learning.Company.mapper;

import com.learning.Company.entity.EmployeeEntity;
import com.learning.Company.to.EmployeeTo;

import java.util.List;

public interface EmployeeMapper extends Mapper<EmployeeTo, EmployeeEntity> {

    @Override
    EmployeeTo map2To(EmployeeEntity employeeEntity);

    @Override
    EmployeeEntity map2Entity(EmployeeTo employeeTo);

    @Override
    default List<EmployeeTo> map2Tos(List<EmployeeEntity> list) {
        return Mapper.super.map2Tos(list);
    }

    @Override
    default List<EmployeeEntity> map2Entities(List<EmployeeTo> list) {
        return Mapper.super.map2Entities(list);
    }
}
