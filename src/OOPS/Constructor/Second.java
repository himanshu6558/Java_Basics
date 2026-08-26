package OOPS.Constructor;

public class Second {
    public static void main(String[] args) {

        Baby baby = new Baby();
        baby.cry();
        baby.eat();
        baby.sleep();

    }
}

class Baby{

    void cry(){
        System.out.println("Cry");
    }
    void eat(){
        System.out.println("Eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
    Baby(){
        System.out.println("Constructor executed");
    }
}
