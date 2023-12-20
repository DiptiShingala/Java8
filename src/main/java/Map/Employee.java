package Map;

public class Employee {
    int id;
    String name;
    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
