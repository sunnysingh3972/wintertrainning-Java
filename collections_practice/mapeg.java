package collections_practice;

import java.util.HashMap;
import java.util.Map;

public class mapeg {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"one");

        map.put(3,"three");
        map.put(4,"four");

        map.put(6,"six");
        map.put(1,"hundred");
        map.put(5,"five");
        map.put(2,"two");

        for (Map.Entry<Integer,String>me: map.entrySet()) {
            System.out.print(me.getKey()+" :");
            System.out.println(me.getValue());
        }
    }
}
