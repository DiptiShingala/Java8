package functionInterface2;

import functionInterface.Sayable;

public class FunctionInterfaceExample2 implements Sayable {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }


}
