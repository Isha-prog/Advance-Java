import java.util.*;
public class descending{
    public static void main (String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(20);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order is = " +list);
        
    }
}