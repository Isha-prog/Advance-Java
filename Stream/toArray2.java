import java.util.*;

public class toArray2 {
    public static void main(String[] args) {
        
        List<Integer> l1=List.of(10,23,34,56,78,90);
        // l1.stream().reduce((e1,e2)->e1+e2).ifPresent(System.out::println);
        Optional x=l1.stream().reduce((e1,e2)->e1+e2);
        System.out.println(x);

        //2 way
        int sum=l1.stream().reduce(0,(e1,e2)->e1+e2);
       System.out.println(sum);
    }
}
