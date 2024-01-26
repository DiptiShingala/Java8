package streamapi;

import java.util.List;

public class Employee {
    private int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", project=" + project +
                '}';
    }

    private String name;
    private double salary;
    private List<String> project;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getProject() {
        return project;
    }

    public void setProject(List<String> project) {
        this.project = project;
    }

    public Employee(int id, String name, double salary, List<String> project) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.project = project;
    }
}
