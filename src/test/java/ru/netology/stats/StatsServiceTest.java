package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void AllSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AveSalesAmount() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long a = sales[3];
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MaxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void MinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthAve() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.minMonthAver(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthAve() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.maxMonthAver(sales);

        Assertions.assertEquals(expected, actual);
    }

}
