package Array;

public class Array_2D {

    public static void main(String[] args) {

        int[][] abc = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Array:");
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {
                System.out.print(abc[i][j] + " | ");
            }
            System.out.println();
        }


    }
}
