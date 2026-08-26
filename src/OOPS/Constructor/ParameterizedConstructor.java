package OOPS.Constructor;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Baby1 baby1 = new Baby1("Samiksha",2001);
        System.out.println(baby1.name);
        System.out.println(baby1.aaNo);
        System.out.println(baby1.year);

        Baby1 baby2 = new Baby1();
        System.out.println(baby2.name);
        System.out.println(baby2.aaNo);
        System.out.println(baby2.year);
    }
}

class Baby1{
    String name;
    int aaNo;
    int year;

    Baby1(String name,int year){
        this.name = name;
        this.year = year;
        aaNo = 1234;
    }

    Baby1(){
        name = "Himan";
        year = 2000;
        aaNo = 123456;
    }
}
