package com.churchmanagement.api.dto;

public record DonationResponse(Long id, String donor, String fund, String amount, String date) {
}
