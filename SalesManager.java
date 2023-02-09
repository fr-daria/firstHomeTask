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

    public long selling() {
        long sum = 0;
        for (long j = 0; j < sales.length; j++) {
            if (Objects.equals(sales[(int) j], Arrays.stream(sales).min())) {
                continue;
            } else if (Objects.equals(sales[(int) j], Arrays.stream(sales).max())) {
                continue;
            }
            sum = sum + sales[(int) j];
            sum = sum / (sales.length - 2);
        }
        return sum;
    }
}