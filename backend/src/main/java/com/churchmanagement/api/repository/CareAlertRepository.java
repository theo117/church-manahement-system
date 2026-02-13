package com.churchmanagement.api.repository;

import com.churchmanagement.api.domain.CareAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareAlertRepository extends JpaRepository<CareAlert, Long> {
}