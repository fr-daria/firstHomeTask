package src;

import java.util.Arrays;
import java.util.Objects;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max(long i) {
        long max = -1;
        for (long sale : sales) {

            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long selling() { //40, 20, 5, 76, 12
        long sum = 0;
        for (long j = 0; j < sales.length; j++) {
            if (Objects.equals(sales[(int) j], Arrays.stream(sales).min())) {
                return sum;
            } else if (Objects.equals(sales[(int) j], Arrays.stream(sales).max())) {
                return sum;
            }
            sum = sum + sales[(int) j];
            sum = sum / (sales.length - 2);
        }
        return sum;
    }
}