package Comparator1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>(List.of(new Employee(100,"Dipti"),new Employee(102,"Megha"),new Employee(103,"Megha")));
        Comparator<Employee> comp = Comparator.comparing(Employee::getName);

        System.out.println(comp);



    }
}
