package Array;

public class ArrayPattern2 {

    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++) {
                if(i%2==0){
                    continue;
                }
                System.out.print("* ");
            }
        }
    }

}
