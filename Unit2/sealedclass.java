sealed class Vehicle permits Bike,Car{
    public void run(){
        System.out.println("Vehicle has started");
    }
}
final class Bike extends Vehicle{
public void start(){
    System.out.println("Bike is running");
}
}
non-sealed class Car extends Vehicle{
    public void start(){
        System.out.println("Car is running");
    }

}
public class sealedclass{
    public static void main(String args[]){
        Vehicle v=new Vehicle();
        v.run();
        Car c=new Car();
        c.start();
        Bike b=new Bike();
        b.start();
    }
}