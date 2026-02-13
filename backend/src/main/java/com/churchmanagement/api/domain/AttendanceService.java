package com.churchmanagement.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance_service")
public class AttendanceService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName;
    private Integer checkedIn;
    private Integer volunteers;

    public AttendanceService() {
    }

    public AttendanceService(String serviceName, Integer checkedIn, Integer volunteers) {
        this.serviceName = serviceName;
        this.checkedIn = checkedIn;
        this.volunteers = volunteers;
    }

    public String getServiceName() {
        return serviceName;
    }

    public Integer getCheckedIn() {
        return checkedIn;
    }

    public Integer getVolunteers() {
        return volunteers;
    }
}