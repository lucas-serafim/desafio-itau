package com.serafim.desafio_itau.services;

import com.serafim.desafio_itau.entities.Transation;
import com.serafim.desafio_itau.entities.dto.TransactionDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private List<Transation> transationList = new ArrayList<>();

    public void create(TransactionDto transactionDto) {
        Transation transation = new Transation(transactionDto.getAmount(), transactionDto.getDateTime());
        transationList.add(transation);
    }

    public void delete() {
        transationList.clear();
    }
}
