package OOPS.Polymorphism;

public class Second {

    public static void main(String[] args) {

        ABC abc = new BCD();
        abc.display();

    }
}

class ABC{

    void display(){
        System.out.println("Hi from A");
    }
}

class BCD extends ABC{

    /*@Override
    void display() {
        System.out.println("Hi from B");
    }*/

    @Override
    void display() {
        super.display();
    }
}
