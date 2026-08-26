package OOPS.Polymorphism;

public class First {
    public static void main(String[] args) {

        Add add = new Add();
        add.sum(254535l,5);
        int sum = add.sum(2,4);
        System.out.println(sum);
        int sum1 = add.sum(2,4,5);
        System.out.println(sum1);


    }
}

class Add{

    void sum(long a,int b){
        System.out.println(a+b);
    }

    int sum(int a,int b){
        return (a+b);
    }

    int sum(int a,int b,int c){
        return (a+b+c);
    }
}
