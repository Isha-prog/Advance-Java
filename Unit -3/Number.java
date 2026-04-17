interface checknumber{
    Boolean check ( int num, int start, int end);
}
public class Number{
    public static void main ( String [] args){
        checknumber c = (num, start, end)->(num>start && num<end);
        int number = 15;
        if(c.check(number, 10,20)){
            System.out.println("Number lies between the given number");
        }else{
            System.out.println("Number does not lies betwwen the given number");
        }
    }
}