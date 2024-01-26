package set;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
       
        set.add(1);
        set.add(0);
        set.add(9);
        set.add(45);
        set.add(3);

        Iterator<Integer> value= set.iterator();
        while (value.hasNext()){
            System.out.println(value.next());


        }


    }
}
