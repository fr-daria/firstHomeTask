package src;

public class Main {

    public static void main(String[] args) {
        SalesManager sm = new SalesManager(new long[]{40, 20, 5, 76, 12});
        sm.max(3);
        System.out.println(sm.selling());

    }
}