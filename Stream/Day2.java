
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}
public class Day2 {
    public static void main(String[] args) {
        
    
    List<Student> stud=Arrays.asList(
        new Student(1,"xyz"),
        new Student(2,"abc"),
        new Student(3,"mno")

    );
    List<String> names=stud.stream().map(s->s.name).collect(Collectors.toList());
    System.out.println(names);
}
}

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

// public class Day2 {
//     public static void main(String[] args) {

//         List<Employee> list = Arrays.asList(
//             new Employee(1, "Rahul", 50000),
//             new Employee(2, "Amit", 70000),
//             new Employee(3, "Neha", 80000),
//             new Employee(4, "Priya", 55000)
//         );

//         List<String> result = list.stream().filter(e -> e.salary > 60000).map(e -> e.name).collect(Collectors.toList());

//         System.out.println(result);
//     }
// }


