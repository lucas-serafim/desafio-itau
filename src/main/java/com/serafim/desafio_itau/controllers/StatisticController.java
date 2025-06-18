package com.serafim.desafio_itau.controllers;

import com.serafim.desafio_itau.entities.dto.StatisticDto;
import com.serafim.desafio_itau.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/statistics", produces = MediaType.APPLICATION_JSON_VALUE)
public class StatisticController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public StatisticDto getStatistic() {
        return this.transactionService.calculate();
    }

}
