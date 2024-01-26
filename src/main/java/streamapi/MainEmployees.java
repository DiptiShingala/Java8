package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainEmployees {
    static List<Employee> employees = new ArrayList<>();
    static{
        employees.add(new Employee(1,"Dipti",1000,List.of("Project1","Project2","Project3")));
        employees.add(new Employee(2,"Naresh",2000,List.of("Project1","Project2","Project3")));
        employees.add(new Employee(3,"Heena",1080,List.of("Project1","Project2","Project3")));
        employees.add(new Employee(4,"Rakesh",1500,List.of("Project1","Project2","Project3")));

    }
    public static void main(String[] args) {

        //forEach method
        employees.stream().forEach(employee -> System.out.println(employee));

        //map
//        List<Employee> incresedSalary = employees.stream().map(employee -> new Employee(employee.getId(), employee.getName(), employee.getSalary()*300,employee.getProject()))
//                        .collect(Collectors.toList());
//        System.out.println(incresedSalary);

        //filter
        List<Employee> filteredSalary = employees.stream()
                .filter(employee -> employee.getSalary()<1500.0)
                .map(employee -> new Employee(employee.getId(),employee.getName(),employee.getSalary(), employee.getProject())).collect(Collectors.toList());
        System.out.println(filteredSalary);

        //flatmap
        String flatData = employees.stream().map(employee -> employee.getProject()).flatMap(string->string.stream()).collect(Collectors.joining(","));
        System.out.println(flatData);


        //findemployee
        Employee firstEmployee = employees.stream().filter(employee -> employee.getSalary()<1500).map(employee -> new Employee(employee.getId(), employee.getName(), employee.getSalary(), employee.getProject())).findFirst().orElse(null);
        System.out.println(firstEmployee);

        //short circuit operation
         List<Employee> shortCircuit = employees.stream().skip(2).limit(1).collect(Collectors.toList());
        System.out.println(shortCircuit);

        //sorting
        List<Employee> sortEmployee = employees.stream().sorted((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).collect(Collectors.toList());
        System.out.println(sortEmployee);

        Employee maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
        System.out.println(maxSalary);
    }
}
