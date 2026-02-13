package com.churchmanagement.api.domain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String donor;
    private String fund;
    private BigDecimal amount;
    private String donationDate;

    public Donation() {
    }

    public Donation(String donor, String fund, BigDecimal amount, String donationDate) {
        this.donor = donor;
        this.fund = fund;
        this.amount = amount;
        this.donationDate = donationDate;
    }

    public String getDonor() {
        return donor;
    }

    public Long getId() {
        return id;
    }

    public String getFund() {
        return fund;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }
}
