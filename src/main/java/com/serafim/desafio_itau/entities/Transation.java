package com.serafim.desafio_itau.entities;

import java.time.LocalDateTime;

public class Transation {

    private Double amount;
    private LocalDateTime dateTime;

    public Transation(Double amount, LocalDateTime dateTime) {
        LocalDateTime now = LocalDateTime.now();

        if (dateTime.isAfter(now)) {
            throw new IllegalArgumentException("Date time must be from past.");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        this.amount = amount;
        this.dateTime = dateTime;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
