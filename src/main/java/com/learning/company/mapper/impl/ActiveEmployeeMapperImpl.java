package com.learning.company.mapper.impl;

import com.learning.company.entity.ActiveEmployeeEntity;
import com.learning.company.mapper.EmployeeMapper;
import com.learning.company.to.ActiveEmployeeTo;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ActiveEmployeeMapperImpl implements EmployeeMapper<ActiveEmployeeTo, ActiveEmployeeEntity> {

    @Override
    public ActiveEmployeeTo map2To(ActiveEmployeeEntity activeEmployeeEntity) {
        if (activeEmployeeEntity != null) {
            return new ActiveEmployeeTo(activeEmployeeEntity.getId(), activeEmployeeEntity.getName(),
                    activeEmployeeEntity.getSalary(), activeEmployeeEntity.getDateEmployment());
        }
        return null;
    }

    @Override
    public ActiveEmployeeEntity map2Entity(ActiveEmployeeTo activeEmployeeTo) {
        if (activeEmployeeTo != null) {
            return new ActiveEmployeeEntity(activeEmployeeTo.getId(), activeEmployeeTo.getName(),
                    activeEmployeeTo.getSalary(), activeEmployeeTo.getDateEmployment());
        }
        return null;
    }

    @Override
    public Set<ActiveEmployeeTo> map2Tos(Set<ActiveEmployeeEntity> set) {
        return EmployeeMapper.super.map2Tos(set);
    }

    @Override
    public Set<ActiveEmployeeEntity> map2Entities(Set<ActiveEmployeeTo> set) {
        return EmployeeMapper.super.map2Entities(set);
    }
}
