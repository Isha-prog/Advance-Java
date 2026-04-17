interface JoinString {
    String join(String a, String b);
}

public class string {
    public static void main(String[] args) {

        JoinString js = (s1, s2) -> s1 + s2;  
        System.out.println(js.join("Hello ", "World"));
    }
}