import java.util.*;
public class foreachmethod{
    public static void main(String args[]){
        List<Integer> l=new ArrayList<>();
        l.add(34);
        l.add(10);
        l.add(9);
        l.add(12);

        //Using foreach method for traversing every element 
        l.forEach(System.out::println);

        l.forEach(i->System.out.println(i));
        
        l.forEach(i->{
            if(i%2==0){
                System.out.println(i);
            }
        });
    }
}