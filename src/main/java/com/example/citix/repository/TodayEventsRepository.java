package com.example.citix.repository;//package com.example.citix.repository;

import com.example.citix.entity.TodayEvents;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodayEventsRepository extends JpaRepository<TodayEvents, Long> {


    TodayEvents findByMainTitle(String mainTitle);
}
