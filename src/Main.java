public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{222, 221, 432, 20, 40});
        long max = salesManager.max();
        System.out.println(max);

    }
}