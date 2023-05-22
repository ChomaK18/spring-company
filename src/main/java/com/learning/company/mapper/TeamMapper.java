package com.learning.company.mapper;

import com.learning.company.entity.TeamEntity;
import com.learning.company.to.TeamTo;

import java.util.Set;

public interface TeamMapper extends Mapper<TeamTo, TeamEntity> {

    @Override
    TeamTo map2To(TeamEntity teamEntity);

    @Override
    TeamEntity map2Entity(TeamTo teamTo);

    @Override
    default Set<TeamTo> map2Tos(Set<TeamEntity> set) {
        return Mapper.super.map2Tos(set);
    }

    @Override
    default Set<TeamEntity> map2Entities(Set<TeamTo> set) {
        return Mapper.super.map2Entities(set);
    }
}
