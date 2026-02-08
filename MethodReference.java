interface method{
    Student get();
}
class Student{
    Student(){
        System.out.println("creating student");
    }
}
public class MethodReference{
    public static void main (String args[]){
        method m=Student::new;
       m.get();
    }
}

//instance object
//interface sell{
//    String display(String s);
//}
//public class MethodReference{
//    public static void main(String args[]){
//        sell ref=String::toUpperCase;
//       System.out.println( ref.display("Java"));
//
//    }
//}