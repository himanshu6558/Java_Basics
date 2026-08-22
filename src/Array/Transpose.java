package Array;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {

        int rows =0;
        int columns = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        rows = sc.nextInt();
        System.out.println("Enter columns");
        columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        int[][] trn_arr = new int[columns][rows];

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

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                trn_arr[j][i] = arr[i][j];
            }
        }

        System.out.println("Final Array");
        for (int i = 0; i < trn_arr.length; i++) {
            for (int j = 0; j < trn_arr[i].length; j++) {
                System.out.print(trn_arr[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
