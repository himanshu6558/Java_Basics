package OOPS.Constructor;

public class Third {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.name);
        System.out.println(vehicle.engine);
        System.out.println(vehicle.model);
    }
}

class Vehicle{
    String name;
    String engine;
    String model;

    Vehicle(){
        name = "Maruti";
        engine = "1.0 L";
        model = "2014";
    }
}

