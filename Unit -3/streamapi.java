import java.util.*;
import java.util.stream.*;

public class streamapi {
public static void main(String[] args) {
    int arr[]={11,2,5,23,45};
    IntStream s=Arrays.stream(arr);
    s.forEach(x->System.out.println(x));

    //collections
    List<Integer> l=new ArrayList<>();
    l.add(45);
    l.add(76);
    l.add(89);

    Stream<Integer> s1=l.stream();
   List<Integer> l1=s1.filter(x->x%2==0).collect(Collectors.toList());
System.out.println(l1);


    // s1.forEach(x->{
    //     if(x%2==0)
    //         list.add(x);
    // });
    // System.out.println(list);
}
    
}