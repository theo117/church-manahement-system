package com.churchmanagement.api.dto;

public record CommunicationResponse(Long id, String channel, String audience, String status) {
}
