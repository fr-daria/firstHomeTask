package src;

public class Main {

    public static void main(String[] args) {
        SalesManager sm = new SalesManager(new long[]{40, 20, 4, 76, 12});
        System.out.println(sm.max());
        System.out.println(sm.min());
        System.out.println(sm.selling());

    }
}