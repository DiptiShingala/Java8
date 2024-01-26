package map;

import java.util.HashMap;
public class HashMapCopiedExample2 {
    public static void main(String[] args) {
        HashMap<Integer,Employee> map = new HashMap<>();
        map.put(1,new Employee(1,"Dipti"));
        HashMap<Integer,Employee> copiedmap = new HashMap<>(map);
        copiedmap.get(1).setName("Modified Name");
        System.out.println( copiedmap.get(1));
    }
}
