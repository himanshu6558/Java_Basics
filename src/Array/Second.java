package Array;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println("Enter the marks");
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }

        System.out.println("Enter marks are:");

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("Total marks:");
        int sum =0;
        for(int i=0;i<marks.length;i++){
            sum = sum + marks[i];
        }

        System.out.println(sum);
    }
}
