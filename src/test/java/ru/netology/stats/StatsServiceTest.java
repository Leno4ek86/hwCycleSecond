package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void ShouldMinSales() {

        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ShouldSumSales() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.sumSales(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void ShouldMaxSales() {
        StatsService manager = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void ShouldAverageSumOfSales() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.averageSum(sales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ShouldBelowAverage() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.belowAverage(sales);
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ShouldAboveAverage() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.aboveAverage(sales);
        int expected = 7;

        Assertions.assertEquals(actual, expected);

    }
}

