package com.example.citix.entity;//package com.example.citix.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class TodayEvents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mainTitle;
    private String mainPhoto;
    @OneToMany(mappedBy = "todayEvents", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Events> events;
}
