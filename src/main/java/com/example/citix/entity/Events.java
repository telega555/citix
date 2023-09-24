package com.example.citix.entity;//package com.example.citix.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="event")
@JsonIgnoreProperties

public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String price;
    private String location;
    private LocalDateTime localDateTime;
    private String photo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "today_events_id")
    @JsonIgnore
    private TodayEvents todayEvents;


}
