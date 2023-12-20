package IteratroeHashmap;

import java.util.HashMap;
import java.util.Map;

public class IteratorHashmapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Megha");
        map.put(2,"Heena");
        map.put(3,"Dipti");
        map.put(4,"Rakesh");
        map.put(5,"Naresh");
        map.put(6,"Dolly");
        System.out.println(map);
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Megha");
        map1.put(2,"Heena");
        map1.put(3,"Heena");
        map1.put(4,"Rakesh");
        map1.put(5,"Naresh");
        map1.put(6,"Dolly");
        System.out.println(map.equals(map1));

        map.compute(4,(key,val) -> val.concat(" Shingala"));
        map.compute(6,(key,val)->val.concat(" Kotadiya"));
        System.out.println(map);
        for(Map.Entry<Integer,String> e : map.entrySet())
            System.out.println("Key " +e.getKey() + " Value "  +e.getValue());

    }
}
