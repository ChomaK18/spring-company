package com.learning.company.mapper;

import com.learning.company.entity.EmployeeEntity;
import com.learning.company.to.EmployeeTo;

import java.util.Set;

public interface EmployeeMapper<T extends EmployeeTo, E extends EmployeeEntity> extends Mapper<T, E> {

    @Override
    T map2To(E e);

    @Override
    E map2Entity(T t);

    @Override
    default Set<T> map2Tos(Set<E> set) {
        return Mapper.super.map2Tos(set);
    }

    @Override
    default Set<E> map2Entities(Set<T> set) {
        return Mapper.super.map2Entities(set);
    }
}
