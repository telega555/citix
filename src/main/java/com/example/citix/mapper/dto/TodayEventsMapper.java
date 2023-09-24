package com.example.citix.mapper.dto;//package com.example.citix.mapper.dto;

import com.example.citix.entity.TodayEvents;
import com.example.citix.mapper.config.DtoMapper;
import com.example.citix.mapper.config.MapstructConfig;
import com.example.citix.mapper.model.TodayEventsDto;
import org.mapstruct.Mapper;

@Mapper(config = MapstructConfig.class)
public interface TodayEventsMapper extends DtoMapper<TodayEventsDto, TodayEvents> {
}
