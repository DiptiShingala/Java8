package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Dipti","Heena","Reema","Sarika"));
        ListIterator<String> listiterator = list.listIterator();
        while(listiterator.hasNext()){
             if(listiterator.next().equalsIgnoreCase("Reema")) {
                listiterator.remove();
            }

        }
        System.out.println(list);
    }
}
