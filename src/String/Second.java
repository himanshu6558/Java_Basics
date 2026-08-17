package String;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String ori = sc.next();

        System.out.println("Checking if entered String is palindrome or not....");

        String rev = "";
        for(int i=ori.length()-1;i>=0;i--)
        {
            rev = rev+ori.charAt(i);
        }
        System.out.println(rev);
        if(ori.equalsIgnoreCase(rev)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String  is not a palindrome");
        }
    }
}
