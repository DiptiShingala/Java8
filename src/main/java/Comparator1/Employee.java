package Comparator1;

import java.time.LocalDate;

public class Employee {
    Long id;
    String name;

    public Employee(long id, String name) {
        this.id=id;
        this.name = name;
    }

    // LocalDate dob;
    public String getName(){
        return name;
    }
}
