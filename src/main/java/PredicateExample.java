import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    static void pred(int number,Predicate<Integer> predicate){
        if(predicate.test(number)){
            System.out.println("number " +number);
        }
    }
    public static void main(String[] args) {
        Predicate<Integer> p = x -> x>30;
        System.out.println("Condition is: " +p.test(90));
        BiPredicate<Integer,Integer> t = (x,y)->x<y;
        System.out.println("Condition is: " +t.test(100,90));
        BiPredicate<String,String> str = (string1,string2)->string1==string2;
        System.out.println("Condition is : " +str.test("Dipti","Ankita"));
        Predicate<Integer> value2 = x ->x<50;
        boolean result = p.and(value2).test(45);
        boolean result2 = p.and(value2).negate().test(45);
        System.out.println(result2);
        System.out.println(result);
        System.out.println("Condition is: " +p.test(90));
        pred(10, (i)->(i>10));

    }
}
