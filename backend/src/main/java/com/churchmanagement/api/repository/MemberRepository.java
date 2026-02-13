package com.churchmanagement.api.repository;

import com.churchmanagement.api.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    long countByStatusIgnoreCase(String status);
}