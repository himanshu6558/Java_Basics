package OOPS.Inheritance;

public class First {
    public static void main(String[] args) {
        Maruti maruti = new Maruti("Swift",2000, "1.2L");
        System.out.println(maruti.name);
        System.out.println(maruti.year);
        System.out.println(maruti.engine);
        maruti.engineSound();
    }
}

class Vehicle{
    String name;
    int year;
    String engine;

    void engineSound(){
        System.out.println("Wooooooooooo");
    }
}

class Maruti extends Vehicle{

    Maruti(String name, int year, String engine){
        System.out.println("Welcome to Maruti");
        this.name = name;
        this.year = year;
        this.engine = engine;
    }
}
