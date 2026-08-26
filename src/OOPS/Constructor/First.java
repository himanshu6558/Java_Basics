package OOPS.Constructor;

public class First {
    public static void main(String[] args) {
        Student student = new Student();
        student.print();
    }
}

class Student{
    String name;

    public void print(){
        System.out.println("Hello");
    }

    Student(){
        System.out.println("As I am constructor, I would execute first");
    }
}
