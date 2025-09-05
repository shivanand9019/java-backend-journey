
abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car started");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Bike startes with a button");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle newCar  = new Car();
        Vehicle v2  = new Bike();
        newCar.start();
        v2.start();
    }
    
}
