package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {

        HashMap student1 = new HashMap();
        student1.put("name","Himanshu");
        student1.put("rollNo",1);
        student1.put("address",246149);
        student1.put("class","5th");
        student1.put("phoneNo",1234567890l);

        HashMap student2 = new HashMap();
        student2.put("name","Arvind");
        student2.put("rollNo",13);
        student2.put("address",245896);
        student2.put("class","5th");
        student2.put("phoneNo",2345678901l);

        HashMap student3 = new HashMap();
        student3.put("name","Golu");
        student3.put("rollNo",52);
        student3.put("address",248001);
        student3.put("class","6th");
        student3.put("phoneNo",3456789012l);


        for(Object o: student2.keySet()){
            System.out.println(o +" -> "+student2.get(o));
        }


        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        students.add(student3);





    }
}
