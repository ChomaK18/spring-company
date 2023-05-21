package com.learning.Company.mapper;

import com.learning.Company.entity.TeamEntity;
import com.learning.Company.to.TeamTo;

import java.util.List;

public interface TeamMapper extends Mapper<TeamTo, TeamEntity> {

    @Override
    TeamTo map2To(TeamEntity teamEntity);

    @Override
    TeamEntity map2Entity(TeamTo teamTo);

    @Override
    default List<TeamTo> map2Tos(List<TeamEntity> list) {
        return Mapper.super.map2Tos(list);
    }

    @Override
    default List<TeamEntity> map2Entities(List<TeamTo> list) {
        return Mapper.super.map2Entities(list);
    }
}
