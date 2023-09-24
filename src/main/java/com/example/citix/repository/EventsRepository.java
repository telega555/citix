package com.example.citix.repository;//package com.example.citix.repository;
//
import com.example.citix.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventsRepository extends JpaRepository<Events, Long> {
    @Override
    Optional<Events> findById(Long id);
    List<Events> findByTodayEventsId(Long todayEventsId);

}
