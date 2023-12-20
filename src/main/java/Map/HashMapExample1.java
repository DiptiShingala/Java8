package Map;

import java.util.HashMap;

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","USA");
        map.put("2","CHINA");
        map.put("3","INDIA");
        map.put("4","CANADA");
        System.out.println(map);
        System.out.println("Size of map: " +map.size());
        if(map.containsKey("1")){
            String a = map.get("1");
            System.out.println("value of 1 is " +a);
        }
        System.out.println(map.containsKey("4"));

    }



}
