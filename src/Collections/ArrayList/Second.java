package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        String choice;

        Scanner sc = new Scanner(System.in);
        System.out.println("_______________Enter the details______________");

        do{
                System.out.println("Enter the name");
                names.add(sc.next());
                System.out.println("Enter the age");
                age.add(sc.nextInt());
                sc.nextLine();
                System.out.println("Do you want to continue Y/N");
                choice = sc.next();
            }while (choice.equalsIgnoreCase("Y"));

        System.out.println(names);
        System.out.println(age);
    }
}
