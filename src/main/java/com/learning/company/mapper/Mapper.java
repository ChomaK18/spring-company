package com.learning.company.mapper;

import java.util.Set;
import java.util.stream.Collectors;

public interface Mapper<T, E> {

    /**
     * Maps from Entity to To
     */
    T map2To(E e);

    /**
     * Maps from To to Entity
     */
    E map2Entity(T t);

    default Set<T> map2Tos(Set<E> set) {
        return set.stream()
                .map(this::map2To)
                .collect(Collectors.toSet());
    }

    default Set<E> map2Entities(Set<T> set) {
        return set.stream()
                .map(this::map2Entity)
                .collect(Collectors.toSet());
    }
}
