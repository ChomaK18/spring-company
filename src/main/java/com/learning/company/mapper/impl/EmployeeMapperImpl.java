package com.learning.company.mapper.impl;

import com.learning.company.entity.ActiveEmployeeEntity;
import com.learning.company.entity.EmployeeEntity;
import com.learning.company.mapper.EmployeeMapper;
import com.learning.company.to.ActiveEmployeeTo;
import com.learning.company.to.EmployeeTo;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeTo map2To(EmployeeEntity employeeEntity) {
        if (employeeEntity != null) {
            if (employeeEntity instanceof ActiveEmployeeEntity) {
                return new ActiveEmployeeTo(employeeEntity.getId(), employeeEntity.getName(),
                        ((ActiveEmployeeEntity) employeeEntity).getSalary(), ((ActiveEmployeeEntity) employeeEntity).getDateEmployment());
            } else {
                return new EmployeeTo(employeeEntity.getId(), employeeEntity.getName());
            }
        }
        return null;
    }

    @Override
    public EmployeeEntity map2Entity(EmployeeTo employeeTo) {
        if (employeeTo != null) {
            if (employeeTo instanceof ActiveEmployeeTo) {
                return new ActiveEmployeeEntity(employeeTo.getId(), employeeTo.getName(),
                        ((ActiveEmployeeTo) employeeTo).getSalary(), ((ActiveEmployeeTo) employeeTo).getDateEmployment());
            } else {
                return new EmployeeEntity(employeeTo.getId(), employeeTo.getName());
            }
        }
        return null;
    }

    @Override
    public Set<EmployeeTo> map2Tos(Set<EmployeeEntity> set) {
        return EmployeeMapper.super.map2Tos(set);
    }

    @Override
    public Set<EmployeeEntity> map2Entities(Set<EmployeeTo> set) {
        return EmployeeMapper.super.map2Entities(set);
    }

}
