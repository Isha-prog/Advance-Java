import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class main2 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ankit", 50000),
                new Employee("Riya", 70000),
                new Employee("Aman", 80000),
                new Employee("Neha", 55000)
        );

        List<String> result = employees.stream()
                .filter(e -> e.getSalary() > 60000)  
                .map(e -> e.getName().toUpperCase())  
                .collect(Collectors.toList());

        System.out.println(result);
    }
}