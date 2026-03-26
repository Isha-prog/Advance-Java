import java.util.*;
class sorted{
    public static void main(String[] args) {
        List<Integer> l1=List.of(34,56,23,47,89);
        List<Integer> l2=l1.stream().sorted(Comparator.reverseOrder()).toList();
        List<Integer> l3=l1.stream().sorted((x,y)->y.compareTo(x)).toList();

       int max= l1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(max);
        System.out.println(l3);

        int min=l1.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(min);
    }
}