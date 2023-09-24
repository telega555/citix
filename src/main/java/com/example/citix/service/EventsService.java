package com.example.citix.service;//package com.example.citix.service;

import com.example.citix.entity.Events;
import com.example.citix.entity.TodayEvents;
import com.example.citix.mapper.dto.EventMapper;
import com.example.citix.mapper.dto.TodayEventsMapper;
import com.example.citix.mapper.model.EventsDto;
import com.example.citix.mapper.model.TodayEventsDto;
import com.example.citix.repository.EventsRepository;
import com.example.citix.repository.TodayEventsRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EventsService {
    private final EventMapper eventMapper;
    private final TodayEventsMapper todayEventsMapper;
    private final TodayEventsRepository todayEventsRepository;
    private final EventsRepository eventsRepository;

    public TodayEventsDto getEvent(){
        TodayEvents todayEvents = todayEventsRepository.findAll().get(0);
        TodayEventsDto todayEventsDto = todayEventsMapper.toDto(todayEvents);
        return todayEventsDto;
    }
    public List<Events> getAllEvents(Long id) {
        System.out.println(id);
        List<Events> eventsOptional = eventsRepository.findByTodayEventsId(id);
        return eventsOptional.stream().collect(Collectors.toList());
    }
}
