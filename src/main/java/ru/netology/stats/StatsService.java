package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long AllSale = 0;

        for (int i = 0; i < sales.length; i++) {
            AllSale += sales[i];
            
        }
        return AllSale;

    }

    public long averageSalesAmount(long[] sales) {
        long AllSale = 0;

        for (int i = 0; i < sales.length; i++) {
            AllSale += sales[i];
        }
        long average = AllSale / 12;
        return average;

    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minMonthAver(long[] sales) {

        int minaver = 0;
        long average = this.averageSalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                minaver+=1;

            }

        }
        return minaver;
    }

    public int maxMonthAver(long[] sales) {

        int maxAver = 0;
        long average = averageSalesAmount(sales);
        for (int i = 0;  sales.length; i++) {
            if (sales[i] > average) {
                maxAver+=1;

            }

        }
        return maxAver;
    }


}
