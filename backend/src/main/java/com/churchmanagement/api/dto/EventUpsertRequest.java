package com.churchmanagement.api.dto;

public record EventUpsertRequest(
    String name,
    String owner,
    Integer progress,
    String eventDate,
    Integer seatsTaken,
    Integer seatsTotal,
    Boolean upcoming
) {
}