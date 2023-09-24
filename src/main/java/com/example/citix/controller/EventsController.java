package com.example.citix.controller;

import com.example.citix.entity.Events;
import com.example.citix.mapper.model.EventsDto;
import com.example.citix.mapper.model.TodayEventsDto;
import com.example.citix.service.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sxodim/today-event")
public class EventsController {

    private final EventsService eventsService;

    @GetMapping("")
    private ResponseEntity<TodayEventsDto> getEvents(){
        TodayEventsDto todayEventsDto = eventsService.getEvent();
        try {
            return ResponseEntity.ok(todayEventsDto);
        }catch (Exception exception){
            return  ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/byMainTitle/{id}")
    private ResponseEntity<List<Events>> getEventsByMainTitle(@PathVariable Long id) {
        List<Events> events = eventsService.getAllEvents(id);
        if (!events.isEmpty()) {
            return ResponseEntity.ok(events);
        }
        return ResponseEntity.notFound().build();
    }
}
