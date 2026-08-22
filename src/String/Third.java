package String;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
        input = input.toLowerCase();

        int vowelCount = 0;
        int constCount = 0;

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
            else{
                constCount++;
            }
        }
        System.out.println("Vowels: "+vowelCount);
        System.out.println("Const: "+constCount);
    }
}
