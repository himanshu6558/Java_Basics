package Basics;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the value for a and b");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println("Sum: "+(a+b));
    }
}
