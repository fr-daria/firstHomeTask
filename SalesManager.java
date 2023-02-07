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
            sum = sum + sales[(int) j];
            sum = sum / sales.length;
        }
        return sum;
    }
}