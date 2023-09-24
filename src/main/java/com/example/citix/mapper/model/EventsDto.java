package com.example.citix.mapper.model;//package com.example.citix.mapper.model;

import java.time.LocalDateTime;


public record EventsDto(
        String title,
        String description,
        LocalDateTime localDateTime,
        String photo,
        String price,
        String location) {

}
