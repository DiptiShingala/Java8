package FunctionInterface;

public class FunctionalInterfaceExample implements Sayable{
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}
