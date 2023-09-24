package com.example.citix.mapper.config;//package com.example.citix.mapper.config;

import java.util.List;
import java.util.Set;

public interface EntityMapper<T,S> {
    T toEntity(S dto);
    Set<T> toEntitySet(Set<S> dtoSet);
    List<T> toEntityLst(List<S> dtoList);
}
