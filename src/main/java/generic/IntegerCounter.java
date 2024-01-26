package generic;

public class IntegerCounter {
    Integer i;

    public void print(Integer i) {
        System.out.println("Integer " + i);
    }

    public static void main(String[] args) {
        IntegerCounter ig = new IntegerCounter();
        // System.out.println(ig.print(3));
        ig.print(3);

    }
}