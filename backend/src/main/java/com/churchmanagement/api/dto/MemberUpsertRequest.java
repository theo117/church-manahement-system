package com.churchmanagement.api.dto;

public record MemberUpsertRequest(
    String name,
    String status,
    String ministry,
    String group,
    String lastAttended
) {
}