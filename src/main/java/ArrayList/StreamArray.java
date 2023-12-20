package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class StreamArray
{
    public static void main(String[] args) {
        ArrayList<String> listone = new ArrayList<>(Arrays.asList("a","b","c","d"));
        ArrayList<String> listtwo = new ArrayList<>(Arrays.asList("a","b","e","f"));
        listone.removeAll(listtwo);
        System.out.println(listtwo);
        List<String> listadded = listtwo.stream().filter(item->!listone.contains(item)).toList();
        System.out.println(listadded);
        Stream<String> stream = Stream.of("Dipti","Reema","Seema","Vivan");
        ArrayList<String> arrayList = stream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arrayList);
    }
}
