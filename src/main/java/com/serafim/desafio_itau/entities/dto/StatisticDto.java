package com.serafim.desafio_itau.entities.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticDto {

    private final Long count;
    private final Double sum;
    private final Double average;
    private final Double min;
    private final Double max;

    public StatisticDto(DoubleSummaryStatistics summaryStatistics) {
        this.count = summaryStatistics.getCount();
        this.sum = summaryStatistics.getSum();
        this.average = summaryStatistics.getAverage();
        this.min = summaryStatistics.getMin() == Double.POSITIVE_INFINITY ? 0 : summaryStatistics.getMin();
        this.max = summaryStatistics.getMax() == Double.NEGATIVE_INFINITY ? 0 : summaryStatistics.getMax();
    }

    public Long getCount() {
        return count;
    }

    public Double getSum() {
        return sum;
    }

    public Double getAverage() {
        return average;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }
}
