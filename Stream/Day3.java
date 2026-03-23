import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7,8,9);

        //1 product of elements using reduce
        int prod=l.stream().reduce(1,(e1,e2)->e1*e2);
        System.out.println(prod);

        //2 find max number using reduce
        int max=l.stream().reduce(0,(e1,e2)->e1>e2?e1:e2);
        System.out.println(max);
        //or
        int y=l.stream().reduce(0,Integer::max);
        System.out.println(y);

        //3 count total elements using reduce without using count method
        int count=l.stream().reduce(0,(acc,e)->acc+1);
        System.out.println(count);

        //4 to calculate sum of all even numbers using reduce
        int evenSum=l.stream().filter(e->e%2==0).reduce(0,(acc,e)->acc+e);
        System.out.println(evenSum);

        //5 to concatenate all strings whose length is greater than 3
        List<String> l1=List.of("java","english","api","lang","str");
        String conc=l1.stream().filter(s->s.length()>3).reduce("",(acc,e)->acc+e);
        System.out.println(conc);

        //6 to multiply only odd numbers using reduce
        int oddProd=l.stream().filter(e->e%2!=0).reduce(1,(e1,e2)->e1*e2);
        System.out.println(oddProd);

        //7 replace all negative numbers with 0 and find the sum using reduce
        List<Integer> l3=List.of(1,-3,2,-5,6,4);
        

    }
}
