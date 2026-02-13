package com.churchmanagement.api.repository;

import com.churchmanagement.api.domain.Communication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunicationRepository extends JpaRepository<Communication, Long> {
}