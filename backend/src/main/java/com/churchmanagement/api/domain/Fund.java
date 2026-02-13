package com.churchmanagement.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long raised;
    private Long goal;

    public Fund() {
    }

    public Fund(String name, Long raised, Long goal) {
        this.name = name;
        this.raised = raised;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public Long getRaised() {
        return raised;
    }

    public Long getGoal() {
        return goal;
    }
}