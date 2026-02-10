class Test{
    Test(){                                 //constructor
        var x=23;
        System.out.println("constructor value"+x);

    }
    void chcekc(){
        var s="Hello";                          //method
        System.out.println(s);
    }
}
public class localVariable {
    public static void main (String args[]){
        Test t=new Test();
        t.chcekc();

        for(var i=0;i<=4;i++){                 //for loop
            System.out.println(i);
        }
    }
    
}
