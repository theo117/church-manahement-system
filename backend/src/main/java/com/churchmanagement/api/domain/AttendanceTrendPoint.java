package com.churchmanagement.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class AttendanceTrendPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer weekOrder;
    @Column(name = "trend_value")
    private Integer value;

    public AttendanceTrendPoint() {
    }

    public AttendanceTrendPoint(Integer weekOrder, Integer value) {
        this.weekOrder = weekOrder;
        this.value = value;
    }

    public Integer getWeekOrder() {
        return weekOrder;
    }

    public Integer getValue() {
        return value;
    }
}
