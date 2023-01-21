public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[] {222,221,432,20,40});
        int max = salesManager.max();
        System.out.println(max);

    }
}