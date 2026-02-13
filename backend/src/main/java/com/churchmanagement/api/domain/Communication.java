package com.churchmanagement.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Communication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String channel;
    private String audience;
    private String status;

    public Communication() {
    }

    public Communication(String channel, String audience, String status) {
        this.channel = channel;
        this.audience = audience;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getChannel() {
        return channel;
    }

    public String getAudience() {
        return audience;
    }

    public String getStatus() {
        return status;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
