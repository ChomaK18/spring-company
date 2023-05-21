package com.learning.Company.mapper.impl;

import com.learning.Company.entity.EmployeeEntity;
import com.learning.Company.mapper.EmployeeMapper;
import com.learning.Company.to.EmployeeTo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeTo map2To(EmployeeEntity employeeEntity) {
        if (employeeEntity != null) {
            return new EmployeeTo(employeeEntity.getId(), employeeEntity.getName());
        }
        return null;
    }

    @Override
    public EmployeeEntity map2Entity(EmployeeTo employeeTo) {
        if (employeeTo != null) {
            return new EmployeeEntity(employeeTo.getId(), employeeTo.getName());
        }
        return null;
    }

    @Override
    public List<EmployeeTo> map2Tos(List<EmployeeEntity> list) {
        return EmployeeMapper.super.map2Tos(list);
    }

    @Override
    public List<EmployeeEntity> map2Entities(List<EmployeeTo> list) {
        return EmployeeMapper.super.map2Entities(list);
    }
}
