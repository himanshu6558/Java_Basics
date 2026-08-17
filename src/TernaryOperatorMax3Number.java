public class TernaryOperatorMax3Number {
    public static void main(String[] args) {
        int a = 1000;
        int b = 200;
        int c = 30;
        int max = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }
}
