package com.example.citix.mapper.config;//package com.example.citix.mapper.config;
//

import java.util.List;
import java.util.Set;

public interface DtoMapper<S, T> {
    S toDto(T entity);

    Set<S> toDtoSet(Set<T> entitySet);

    List<S> toDtoList(List<T> entityList);
}