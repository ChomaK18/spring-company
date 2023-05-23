package com.learning.company.mapper;

import com.learning.company.entity.EmployeeEntity;
import com.learning.company.to.EmployeeTo;

import java.util.Set;

public interface EmployeeMapper extends Mapper<EmployeeTo, EmployeeEntity> {

    @Override
    EmployeeTo map2To(EmployeeEntity e);

    @Override
    EmployeeEntity map2Entity(EmployeeTo t);

    @Override
    default Set<EmployeeTo> map2Tos(Set<EmployeeEntity> set) {
        return Mapper.super.map2Tos(set);
    }

    @Override
    default Set<EmployeeEntity> map2Entities(Set<EmployeeTo> set) {
        return Mapper.super.map2Entities(set);
    }
}
