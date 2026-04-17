interface Max{
int findmax (int x, int y);
}

public class maximum {
    public static void main (String[] args){
        Max m = (x,y)->(x > y)? x:y;
        System.out.println(m.findmax(10,20));
    }
    
}