public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max(int i) {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int selling() {
        int sum = 0;
        for (int j = 0; j < sales.length; j++) {
            sum = sum + sales[j];
            sum = sum / sales.length;
        }
        return sum;
    }
}