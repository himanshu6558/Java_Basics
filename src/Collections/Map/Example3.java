package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Example3 {

    public static void main(String[] args) {

        String input = "Programming";

        HashMap<Character,Integer> hashMap = new HashMap();

        for(char c: input.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }

        System.out.println(hashMap);

    }

}
