import java.util.*;
public class streamapi4{
    public static void main (String [] args){
        List<Integer> l1 = List.of(10,34,56,34,78);
        // l1.stream().reduce((e1,e2)->e1+e2).ifPresent(System.out::println);
        //   or this can be used in place of the above on 
        Optional x=l1.stream().reduce((e1,e2)->e1+e2);
        System.out.println(x);

        // 2nd way
        int sum = l1.stream().reduce(0,(e1,e2)->e1+e2);
        System.out.println(sum);
    }
}