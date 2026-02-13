package com.churchmanagement.api.dto;

public record CommunicationUpsertRequest(String channel, String audience, String status) {
}