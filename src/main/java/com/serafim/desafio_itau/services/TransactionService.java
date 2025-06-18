package com.serafim.desafio_itau.services;

import com.serafim.desafio_itau.entities.Transation;
import com.serafim.desafio_itau.entities.dto.StatisticDto;
import com.serafim.desafio_itau.entities.dto.TransactionDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

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

    public StatisticDto calculate() {

        LocalDateTime threshold = LocalDateTime.now().minusSeconds(60);

        DoubleSummaryStatistics summaryStatistics = transationList.stream()
                .filter(current -> current.getDateTime().isAfter(threshold))
                .mapToDouble(Transation::getAmount)
                .summaryStatistics();

        return new StatisticDto(summaryStatistics);
    }
}
