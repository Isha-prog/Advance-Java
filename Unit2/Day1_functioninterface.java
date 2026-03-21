// @FunctionalInterface
// interface  hello {
// void display();
    
// }
// public class Day1_functioninterface{
//     public static void main (String args[]){

//         //using lambda function of zero parameter 

// hello h=()->System.out.println("hello");
// h.display();
//     }
// }

//with parameter
interface hii{
    int display(int a,int b);
}
public class Day1_functioninterface{
    public static void main (String args[]){
        hii h =(a,b)-> a+b; ;
        int result=h.display(10,20);
     System.out.println(result);
    }
}