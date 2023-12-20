import java.util.function.Predicate;

public class PredicateExample2 {
    public static Predicate<String> example = new Predicate<String>() {
        public boolean test(String s) {
            return s.length()>10;
        }
    };
    public static void predicate_or(){
        Predicate<String> str = p-> p.contains("A");
        String containsA = "AKruti";
        boolean reault = example.or(str).test(containsA);
        System.out.println(reault);


    }

    public static void main(String[] args) {

        predicate_or();
    }


}
