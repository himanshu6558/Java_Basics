package OOPS.Abstraction;

public class Interface {

    public static void main(String[] args) {
        Maruti1 maruti1 = new Maruti1();
        maruti1.length();
        maruti1.bootCapcity();
        maruti1.height();
        maruti1.length();
    }

}

interface SUV{
    int seatingCapcity =5;
    void height();
    void length();
    static void groundClearance(){
        System.out.println("Min should be 185mm");
    }
    default void engine(){
        System.out.println("Min should be 1.2l");
    }
    void bootCapcity();
}

interface MUV{
    int seatingCapcity =5;
    void height();
    void length();
    static void groundClearance(){
        System.out.println("Min should be 180mm");
        System.out.println("Seat Capcity"+seatingCapcity);
    }
    default void engine(){
        System.out.println("Min should be 1.2l");
    }
    void bootCapcity();
}

class Maruti1 implements SUV, MUV{

    @Override
    public void height() {
        System.out.println("1.5m");
    }

    @Override
    public void length() {
        System.out.println("3.99mm");
    }

    @Override
    public void engine() {
        SUV.super.engine();
    }

    @Override
    public void bootCapcity() {
        System.out.println("350L");
    }
}
