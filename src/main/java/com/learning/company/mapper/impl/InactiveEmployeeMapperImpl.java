package com.learning.company.mapper.impl;

import com.learning.company.entity.InactiveEmployeeEntity;
import com.learning.company.mapper.EmployeeMapper;
import com.learning.company.to.InactiveEmployeeTo;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InactiveEmployeeMapperImpl implements EmployeeMapper<InactiveEmployeeTo, InactiveEmployeeEntity> {

    @Override
    public InactiveEmployeeTo map2To(InactiveEmployeeEntity inactiveEmployeeEntity) {
        if (inactiveEmployeeEntity != null) {
            return new InactiveEmployeeTo(inactiveEmployeeEntity.getId(), inactiveEmployeeEntity.getName());
        }
        return null;
    }

    @Override
    public InactiveEmployeeEntity map2Entity(InactiveEmployeeTo inactiveEmployeeTo) {
        if (inactiveEmployeeTo != null) {
            return new InactiveEmployeeEntity(inactiveEmployeeTo.getId(), inactiveEmployeeTo.getName());
        }
        return null;
    }

    @Override
    public Set<InactiveEmployeeTo> map2Tos(Set<InactiveEmployeeEntity> set) {
        return EmployeeMapper.super.map2Tos(set);
    }

    @Override
    public Set<InactiveEmployeeEntity> map2Entities(Set<InactiveEmployeeTo> set) {
        return EmployeeMapper.super.map2Entities(set);
    }
}
