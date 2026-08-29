package OOPS.Abstraction;

public class Abstract {

    public static void main(String[] args) {
        Maruti maruti = new Maruti();
        maruti.engine();
        maruti.tank_capcity();
        maruti.sound();
        System.out.println(maruti.model_update);
        maruti.model_update = 2019;
        System.out.println(maruti.model_update);
    }
}

abstract class Vehicle {
    int model_update = 2015;
    abstract void engine();
    abstract void tank_capcity();

    void sound(){
        System.out.println("bbwwooooo");
    }

    void model(){
        System.out.println("Model: "+model_update);
    }
}

class Maruti extends Vehicle{

    @Override
    void engine() {
        System.out.println("1.0L");
    }

    @Override
    void tank_capcity() {
        System.out.println("35l");
    }
}
