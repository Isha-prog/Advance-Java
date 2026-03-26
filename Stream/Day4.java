import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

// 1 to extract name of all students from a list of student objects using map()
// class Student{
// String name;
// int id;
// Student(String name,int id){
//     this.name=name;
//     this.id=id;
// }
// public String getname(){
//     return name;
// }
// }
// public class Day4 {
//     public static void main(String[] args) {
//         List<Student> stud=Arrays.asList(
//             new Student("Isha",11),
//             new Student("riya",21)
//         );
//         List<String> names=stud.stream().map(Student::getname).toList();
//         System.out.println(names);
//     }
// }

// 2 filter numbers greater than 50 from a list of integers and store in a list

// class Day4{
//     public static void main(String[] args) {
//         List<Integer> l1=Arrays.asList(11,34,67,89,90,24,100);
//         List<Integer> result =l1.stream().filter(x->x>50).collect(Collectors.toList());
//         System.out.println(result);
//     }
// }

//  3 to filter positive numbers greater than 20 from list of integers
// class Day4{
//     public static void main(String[] args) {
//         List<Integer> l1=Arrays.asList(11,-20,34,-10,45);
//         List<Integer> result=l1.stream().filter(x->x>20).toList();
//         System.out.println(result);

//     }
// }

// 4 to filter all strings start with A 
// class Day4{
//     public static void main(String[] args) {
//         List<String> l1=Arrays.asList("apple","mango","altitude","star");
//         List<String> result=l1.stream().filter(s->s.startsWith("a")).toList();
//         System.out.println(result);
//     }
// }

// 5 to filter all strings ends with A 
// class Day4{
//     public static void main(String[] args) {
//         List<String> l1=Arrays.asList("apple","mango","lara","sitara");
//         List<String> result=l1.stream().filter(s->s.endsWith("a")).toList();
//         System.out.println(result);
//     }
// }

// 6 to filter positive numbers
class Day4{
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(11,23,45,34,23);
        List<Integer> positive=l1.stream().filter(x->x>0).toList();
        System.out.println(positive);

        // 7 to filter odd numbers
         List<Integer> odd=l1.stream().filter(x->x%2!=0).toList();
         System.out.println(odd);

         // 8 to filter all String containing A 
         List<String> l2=Arrays.asList("isha","riya","siya");
         List<String> cont=l2.stream().filter(s->s.contains("a")).toList();
         System.out.println(cont);

         //9 wap to filter all strings whose length is greater than 5 from a list of strings
        List<String> result4 = l2.stream() .filter(s -> s.length() > 5).collect(Collectors.toList());
        System.out.println(result4);

        //10 wap to filter numbers divisible by 3 from a list of integers
        List<Integer> divisibleBy3 = l1.stream() .filter(n -> n % 3 == 0).collect(Collectors.toList());
        System.out.println(divisibleBy3);

        //11 wap usin map() to covert a list of lowercase strings to uppercase strings
        List<String> uppercaseList = l2.stream() .map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercaseList);  

        //12 add 10 to each element in a list of integers using map()
        List<Integer> add10 = l1.stream() .map(n -> n + 10).   collect(Collectors.toList());
        System.out.println(add10);

        //13 find the length of each string in a list of strings using map()
        List<Integer> lengths = l2.stream() .map(s -> s.length()).collect(Collectors.toList());
        System.out.println(lengths);

        //14 extract the first character of each string  using map()
        List<Character> firstCharacters = l2.stream() .map(s -> s.charAt(0)).collect(Collectors.toList());
        System.out.println(firstCharacters);

        //15 from a list of integer replace all negative numbers with 0 using map()
        List<Integer> replaceNegatives = l1.stream() .map(n -> n < 0 ? 0 : n).collect(Collectors.toList());
        System.out.println(replaceNegatives);

        //16 given a list of integer covert each number to its square using map()
        List<Integer> squares = l1.stream() .map(n -> n * n).collect(Collectors .toList());
        System.out.println(squares);

        //17 given a list of integer create a new list whwere each element is doubled using map()
        List<Integer> doubled = l1.stream() .map(n -> n * 2).collect(Collectors.toList());
        System.out.println(doubled);

    }
}