interface compare{
    int greater(int a, int b);
    }
    public class main{
        public static void main(String[] args){
            compare c = (a,b)->(a > b)? a:b;
            int result = c.greater(10,20);
            System.out.println("Greater number is = " + result);
        }
    }
