package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;


class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateMinSales() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = statsService.minSales(sales);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateMaxSales() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = statsService.maxSales(sales);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = statsService.calculateSum(sales);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateAvg() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = statsService.calculateAvg(sales);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateUnderAvgMonths() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = statsService.underAvgMonths(sales);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateOverAvgMonths() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = statsService.overAvgMonths(sales);

        assertEquals(expected, actual);

    }
}