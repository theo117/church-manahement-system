package com.churchmanagement.api.repository;

import com.churchmanagement.api.domain.ChurchEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChurchEventRepository extends JpaRepository<ChurchEvent, Long> {
    List<ChurchEvent> findByUpcomingTrue();
}