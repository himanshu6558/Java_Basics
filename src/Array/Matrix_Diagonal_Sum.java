package Array;

import java.util.Scanner;

public class Matrix_Diagonal_Sum {

    public static void main(String[] args) {

        System.out.println("Enter the rows and columns");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        System.out.println("Enter the elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Initial Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                  sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Sum: "+sum);
    }
}
