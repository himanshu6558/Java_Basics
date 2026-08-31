package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMapExample {

    public static void main(String[] args) {

        Map vehilce = new HashMap();
        vehilce.put("Honda",2);
        vehilce.put("BMW",4);

        System.out.println(vehilce);

        for(Object key: vehilce.keySet()){
            System.out.println(key);
            System.out.println(vehilce.get(key));
        }

    }
}
