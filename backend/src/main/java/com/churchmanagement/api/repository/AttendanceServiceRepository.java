package com.churchmanagement.api.repository;

import com.churchmanagement.api.domain.AttendanceService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceServiceRepository extends JpaRepository<AttendanceService, Long> {
}