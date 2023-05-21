package com.learning.Company.mapper;

import java.util.List;
import java.util.stream.Collectors;

public interface Mapper<T, E> {

    /**
     * Maps from Entity to TO
     */
    public abstract T map2To(E e);

    /**
     * Maps from TO to Entity
     */
    public abstract E map2Entity(T t);

    public default List<T> map2Tos(List<E> list) {
        return list.stream()
                .map(this::map2To)
                .collect(Collectors.toList());
    }

    public default List<E> map2Entities(List<T> list) {
        return list.stream()
                .map(this::map2Entity)
                .collect(Collectors.toList());
    }
}
