package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    String name;
    int id;
    public ArrayListExample2(String name,int id){
        this.name = name;
        this.id = id;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        ArrayListExample2 item = (ArrayListExample2) obj;
        return id ==item.id;
    }
    public static void main(String[] args) {
        ArrayList<ArrayListExample2> list = new ArrayList<>(List.of(new ArrayListExample2("Dipti",5),new ArrayListExample2("Heena",1)));
        System.out.println(list.contains(new ArrayListExample2("Dipti",5)));
    }
}
