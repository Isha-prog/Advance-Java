
class Student{
    int id;
    String name;
    Student(){
        System.out.println("No argument constructor");
        id=22;
    }
    Student(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println(id+" "+name);
    }
    Student(Student s){
        this.id=s.id;
        this.name=s.name;
        System.out.println("copy value"+id+" "+name);
    }
}
public class construct {
    public static void main (String args[]){
        Student s=new Student();
        System.out.println(s.id);

    }
}
