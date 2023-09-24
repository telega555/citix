package com.example.citix.mapper.dto;//package com.example.citix.mapper.dto;

import com.example.citix.entity.Events;
import com.example.citix.mapper.config.DtoMapper;
import com.example.citix.mapper.config.MapstructConfig;
import com.example.citix.mapper.model.EventsDto;
import org.mapstruct.Mapper;

@Mapper(config = MapstructConfig.class)
public interface EventMapper  extends DtoMapper<EventsDto, Events> {
}
