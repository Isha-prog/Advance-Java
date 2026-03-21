interface inter1{
    default void def(){
        System.out.println("default method inside interface 1");
    }
}
//default method 

interface inter2{
    default void def(){
        System.out.println("default method inside interface 2");
    }
}
//static method

interface inter3{
    static int add(int x,int y){
        return x+y;
    }
}
//private method
interface inter4{
    private void checkBalance(){
        System.out.println("checking balance");
    }
    default void deposit(){
        System.out.println("money deposited");
        checkBalance();
    }
}

public class defaultmethod implements inter1,inter2,inter3,inter4{
    public void def(){
        inter1.super.def();
        inter2.super.def();
    }
    public static void main(String args[]){
        defaultmethod d=new defaultmethod();
        d.def();                               //calling default method
        System.out.println(inter3.add(4,5));   //static method called directly
        d.deposit();                           //calling private method
    }
}