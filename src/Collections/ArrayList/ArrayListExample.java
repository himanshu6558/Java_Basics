package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList arrayListExample = new ArrayList();
        arrayListExample.add(2);
        arrayListExample.add(3);
        arrayListExample.add(5);
        arrayListExample.add(1,7);
        arrayListExample.add("Himanshu");


        System.out.println(arrayListExample);

        for( Object o:arrayListExample){
            System.out.println(o);
        }

        System.out.println(arrayListExample.isEmpty());
        arrayListExample.remove(2);
        System.out.println(arrayListExample.size());
        System.out.println(arrayListExample.contains(7));
        System.out.println(arrayListExample.indexOf(5));
        arrayListExample.set(0,88);


        System.out.println(arrayListExample);

        for (int i = 0; i < arrayListExample.size(); i++) {
            System.out.println(arrayListExample.get(i));
        }

        Iterator iterator = arrayListExample.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
