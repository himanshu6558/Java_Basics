package Array;

import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        long sum = 0;
        int mul = 1;

        System.out.println("Enter "+ (rows*columns) + " elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Pattern:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println(" ");
        }

        System.out.println("_________________");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum: "+sum);

        System.out.println("_________________");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                mul = mul * arr[i][j];
            }
        }
        System.out.println("Mul: "+mul);

        int arr2[][] = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr2[j][i] = arr[i][j];
            }
        }

        System.out.println("_____________");
        System.out.println("Transpose of matrix");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " | ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
