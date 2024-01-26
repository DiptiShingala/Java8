package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Enhanced {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(78, 90, 34, 56, 7, 3));
        list.forEach(e ->
        {
            System.out.println(e);
        });
        list.stream().forEach(e -> {
            System.out.println(e);
        });
        List evenNumber = list.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumber);
        List collections = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collections);
        List squareResult = list.stream().map(e -> e * e).toList();
        System.out.println(squareResult);
        Collections.sort(list);
        System.out.println(list);
    }
}
