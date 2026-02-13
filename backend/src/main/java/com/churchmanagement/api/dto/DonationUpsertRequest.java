package com.churchmanagement.api.dto;

import java.math.BigDecimal;

public record DonationUpsertRequest(
    String donor,
    String fund,
    BigDecimal amount,
    String date
) {
}