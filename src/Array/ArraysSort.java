package Array;

import java.util.Scanner;

public class ArraysSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter the " + size + " elements:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Second Largest Number");
        System.out.println(returnSecondLargest(num));
    }

    static int returnSecondLargest(int[] num) {
        int temp = 0;

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted List:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        return num[num.length - 2];
    }

}
