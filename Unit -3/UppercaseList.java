import java.util.*;

public class UppercaseList {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("apple", "banana", "mango", "grapes");

        list.forEach(s -> System.out.println(s.toUpperCase()));
    }
}