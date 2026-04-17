interface calculator{
int calculat(int x, int y);
}
public class calculate{
    public static void main(String[] args){
        calculator add  = (a,b)-> a+b;
        calculator sub  = (a,b)-> a-b;
        calculator multi  = (a,b)-> a*b;
        calculator div  = (a,b)-> a/b;

        System.out.println("addition="+add.calculat(5,10));
                System.out.println("subtraction="+sub.calculat(5,10));

                        System.out.println("multiplication="+multi.calculat(5,10));
        System.out.println("division="+div.calculat(5,10));


    }
}
