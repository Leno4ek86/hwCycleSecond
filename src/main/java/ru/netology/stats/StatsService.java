package ru.netology.stats;


public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public long sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public int averageSum(int[] sales) {

        int sumSales = 0;
        int averageSum = 0;

        for (int sale : sales) {
            averageSum = (int) sumSales(sales) / sales.length;

        }
        return averageSum;
    }

    public int belowAverage(int[] sales) {
        int averageSum = 0;
        int belowAverage = 0;

        for (int sale : sales) {

            averageSum = (int) sumSales(sales) / sales.length;
            {
                if (sale <= averageSum) {
                    belowAverage = belowAverage + 1;
                }
            }
        }
        return belowAverage;
    }



    public int aboveAverage(int[] sales) {
        int averageSum = 0;
        int aboveAverage = 0;

        for (int sale : sales) {

            averageSum = (int) sumSales(sales) / sales.length;
            {
                if (sale >= averageSum) {
                    aboveAverage = aboveAverage + 1;
                }
            }
        }
        return aboveAverage;
    }
}






