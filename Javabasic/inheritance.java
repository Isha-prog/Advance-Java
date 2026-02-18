class A{
    void show(){
        System.out.println("Parent class A ");
    }
}
class B extends A{                             //single level inheritance
    void display(){
        System.out.println("class B");
    }
}
class C extends B{                              //multilevel inheritance
    void check(){
        System.out.println("class c");
    }

}

    public class inheritance {
        public static void main(String args[]){
    C c=new C();
    c.show();
    c.display();
    c.check();
        }
}
