package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        int sum = calculateSum(sales);

        return sum / sales.length;
    }

    public int underAvgMonths(int[] sales) {
        int avg = calculateAvg(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < avg) {
                count = count + 1;
            }
        }
        return count;
    }

    public int overAvgMonths(int[] sales) {
        int avg = calculateAvg(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > avg) {
                count = count + 1;
            }
        }
        return count;
    }
}



