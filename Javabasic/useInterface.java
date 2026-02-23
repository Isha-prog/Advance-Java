interface ill{
    public void calculate(int x);
}
class Square implements ill{
    public void calculate(int p){
        int area=p*p;
        System.out.println(area);
    }
}
    public class useInterface {
    public static void main(String[] args) {
        ill s=new Square();
        s.calculate(5);
    }
}
