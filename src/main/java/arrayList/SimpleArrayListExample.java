package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> newList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(List.of(2,6,8,9,0));
        ArrayList<String> listing = new ArrayList<>(Arrays.asList("hina","rima","daya"));
        boolean isEmpty = listing.isEmpty();
        System.out.println(isEmpty);
        newList.add("Dipti");
        newList.add("Heena");
        newList.add("Java");
        newList.add("Rakesh");
        newList.add("Naresh");
        list.remove(2);
        list.add(3,1);
        list.set(2,0);
        System.out.println(newList);
        System.out.println(list);
        System.out.println(listing);
        newList.addAll(List.of("dax","tirth"));
        System.out.println(list.size());
        System.out.println(newList);

    }


}
