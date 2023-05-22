package com.learning.company.mapper.impl;

import com.learning.company.entity.EmployeeEntity;
import com.learning.company.mapper.EmployeeMapper;
import com.learning.company.to.EmployeeTo;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class EmployeeMapperImpl implements EmployeeMapper<EmployeeTo, EmployeeEntity> {

    @Override
    public EmployeeTo map2To(EmployeeEntity EmployeeEntity) {
        if (EmployeeEntity != null) {
            return new EmployeeTo(EmployeeEntity.getId(), EmployeeEntity.getName());
        }
        return null;
    }

    @Override
    public EmployeeEntity map2Entity(EmployeeTo EmployeeTo) {
        if (EmployeeTo != null) {
            return new EmployeeEntity(EmployeeTo.getId(), EmployeeTo.getName());
        }
        return null;
    }

    @Override
    public Set<EmployeeTo> map2Tos(Set<EmployeeEntity> set) {
        return com.learning.company.mapper.EmployeeMapper.super.map2Tos(set);
    }

    @Override
    public Set<EmployeeEntity> map2Entities(Set<EmployeeTo> set) {
        return com.learning.company.mapper.EmployeeMapper.super.map2Entities(set);
    }

}
