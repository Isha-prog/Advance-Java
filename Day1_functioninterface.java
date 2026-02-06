@FunctionalInterface
interface  hello {
void display();
    
}
public class Day1_functioninterface{
    public static void main (String args[]){

        //using lambda function

hello h=()->System.out.println("hello");
h.display();
    }
}

