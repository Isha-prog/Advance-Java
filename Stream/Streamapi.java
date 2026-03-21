package Stream;

import java.util.*;
import java.util.stream.*;

public class Streamapi {
public static void main(String[] args) {
    int arr[]={11,2,5,23,45};
    IntStream s=Arrays.stream(arr);
    s.forEach(x->System.out.println(x));

    //values


    //collections
    List<Integer> l=new ArrayList<>();
    l.add(45);
    l.add(76);
    l.add(89);
    l.add(20);

    // Stream<Integer> s1=l.stream();
   List<Integer> l1=l.stream().filter(x->x%2==0).collect(Collectors.toList());
   System.out.println(l1);

List<Integer> l2=l.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
   System.out.println(l2);   

   List<Integer> l3=l.stream().map(x->x*x).collect(Collectors.toList());
   System.out.println(l3); 

}
    
}