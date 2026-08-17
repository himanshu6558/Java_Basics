package String;

public class First {
    public static void main(String[] args) {

        String name = "Himanshu";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.getBytes());
        System.out.println(name);

        String email_id = "himanshu@y3gmail.com";
        String[] splitter = email_id.split("@");
        System.out.println(splitter[0]);
        System.out.println(splitter[1]);

    }
}
