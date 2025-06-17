package com.serafim.desafio_itau.entities.dto;

import com.serafim.desafio_itau.entities.Transation;

import java.time.LocalDateTime;

public class TransactionDto {

    private Double amount;
    private LocalDateTime dateTime;

    public TransactionDto() {
    }

    public TransactionDto(Transation transation) {
        this.amount = transation.getAmount();
        this.dateTime = transation.getDateTime();
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
