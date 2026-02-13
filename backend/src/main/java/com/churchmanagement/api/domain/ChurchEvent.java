package com.churchmanagement.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "church_event")
public class ChurchEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String owner;
    private Integer progress;
    private String eventDate;
    private Integer seatsTaken;
    private Integer seatsTotal;
    private Boolean upcoming;

    public ChurchEvent() {
    }

    public ChurchEvent(String name, String owner, Integer progress, String eventDate, Integer seatsTaken, Integer seatsTotal, Boolean upcoming) {
        this.name = name;
        this.owner = owner;
        this.progress = progress;
        this.eventDate = eventDate;
        this.seatsTaken = seatsTaken;
        this.seatsTotal = seatsTotal;
        this.upcoming = upcoming;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getProgress() {
        return progress;
    }

    public String getEventDate() {
        return eventDate;
    }

    public Integer getSeatsTaken() {
        return seatsTaken;
    }

    public Integer getSeatsTotal() {
        return seatsTotal;
    }

    public Boolean getUpcoming() {
        return upcoming;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setSeatsTaken(Integer seatsTaken) {
        this.seatsTaken = seatsTaken;
    }

    public void setSeatsTotal(Integer seatsTotal) {
        this.seatsTotal = seatsTotal;
    }

    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }
}
