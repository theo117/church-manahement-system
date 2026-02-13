package com.churchmanagement.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String status;
    private String ministry;
    private String smallGroup;
    private String lastAttended;

    public Member() {
    }

    public Member(String name, String status, String ministry, String smallGroup, String lastAttended) {
        this.name = name;
        this.status = status;
        this.ministry = ministry;
        this.smallGroup = smallGroup;
        this.lastAttended = lastAttended;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getMinistry() {
        return ministry;
    }

    public String getSmallGroup() {
        return smallGroup;
    }

    public String getLastAttended() {
        return lastAttended;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMinistry(String ministry) {
        this.ministry = ministry;
    }

    public void setSmallGroup(String smallGroup) {
        this.smallGroup = smallGroup;
    }

    public void setLastAttended(String lastAttended) {
        this.lastAttended = lastAttended;
    }
}
