package Array;

public class First {

    public static void main(String[] args) {

        int[] marks = {1,2,3,4,5};

        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        for(Object o: marks){
            System.out.println(o);
        }
    }
}
