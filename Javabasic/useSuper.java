class A{
    int x=10;
    A(){
        this(5);
        System.out.println("inside parent constructor");
    }
    A(int x){
        System.out.println("parameterised constructor");
    }
    // void show(){
    //     System.out.println("Parent class A ");
    // }
}
class B extends A{                             
    int y=55;
    B(){
        super();                                 //constructor chaining
        System.out.println("inside child constructor");
    }
    void display(){
        // super.show();
        System.out.println(super.x);
        System.out.println("class B");
    }
}
public class useSuper {
    public static void main(String args[]){
//    B b=new B();
//    b.display();

A a=new A();
    }
}
