public class switchExpress {
    public static void main(String args[]){
        int a=20,b=7;
        char ch='=';
        int result=switch(ch){
            case '+'->a+b;
            case '-'->a-b;
            case '*'->a*b;
            case '/'->a/b;
            default-> -1;
        };
        System.out.println(result);

        String days="monday";
        int d=switch(days){
            case "monday","friday","sunday"->6;
            case"tuesday" ->7;
            case "wednesday"->9;
            case "thursday","saturday"->8;
            default ->-1;
     };
  System.out.println(d );
    

    String month="december";
    String season=switch(month){
     case "november","december","january ","february"->{
        System.out.println("greetings of the day");
        yield "winter";
     }
     case "june ","july"->{
        System.out.println("greetings of the day");
        yield "summer";
     }
     default ->{
        yield "invalid month";
        }
    };
System.out.println(season);


int number=2;
String output=switch(number){
    case 1:{
        yield "one";
    }
    case 2:{
        yield "two";
    }
    default:{
        yield "invalid";
    }
};
System.out.println(output);

    }
}

