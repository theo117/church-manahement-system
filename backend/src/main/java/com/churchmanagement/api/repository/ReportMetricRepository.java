package com.churchmanagement.api.repository;

import com.churchmanagement.api.domain.ReportMetric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportMetricRepository extends JpaRepository<ReportMetric, Long> {
}