package com.churchmanagement.api.repository;

import com.churchmanagement.api.domain.AttendanceTrendPoint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceTrendPointRepository extends JpaRepository<AttendanceTrendPoint, Long> {
    List<AttendanceTrendPoint> findAllByOrderByWeekOrderAsc();
}