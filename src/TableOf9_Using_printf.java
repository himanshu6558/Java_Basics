public class TableOf9_Using_printf {
    public static void main(String[] args) {
        int num = 9;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d", num, i, num * i);
            System.out.println();
        }
    }
}
