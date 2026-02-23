abstract class shape{
    abstract public void calculate(int x,int y);
}
class Rectangle extends shape{
    public void calculate(int l,int b){
        int area=l*b;
        System.out.println("area "+area);
    }

}
public class abs {
    public static void main(String args[]){
        shape s=new Rectangle();
        s.calculate(3,5);
    }
}
