package com.learning.company.mapper.impl;

import com.learning.company.entity.TeamEntity;
import com.learning.company.mapper.EmployeeMapper;
import com.learning.company.mapper.TeamMapper;
import com.learning.company.to.TeamTo;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class TeamMapperImpl implements TeamMapper {

    private final EmployeeMapper employeeMapper;

    public TeamMapperImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public TeamTo map2To(TeamEntity teamEntity) {
        if (teamEntity != null) {
            return new TeamTo(teamEntity.getName(), this.employeeMapper.map2Tos(teamEntity.getEmployees()));
        }
        return null;
    }

    @Override
    public TeamEntity map2Entity(TeamTo teamTo) {
        return null;
    }

    @Override
    public Set<TeamTo> map2Tos(Set<TeamEntity> set) {
        return TeamMapper.super.map2Tos(set);
    }

    @Override
    public Set<TeamEntity> map2Entities(Set<TeamTo> set) {
        return TeamMapper.super.map2Entities(set);
    }
}
