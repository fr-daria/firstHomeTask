package src;

import java.util.Arrays;
import java.util.Objects;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {

            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {

            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }

    public long selling() { //40, 20, 5, 76, 12
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return (sum - (min() + max())) / (sales.length - 2);
    }
}