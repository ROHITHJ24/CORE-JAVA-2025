import java.util.*;
//  Bike, Car, Truck, Car, Truck
class Vehicle{
     void startEngine(){
        System.out.println("Vehicle Engine Starts");
    }
}

class  Bike extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("BIKE : drrrrrrrrrrrr");
    }

}
class  Car extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("CAR : keeech keech keechhh vroooommm");
    }

}
class  Truck extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("TRUCK : grrrrhhhh pom pom pom");
    }

}
class OverridingExample{
    public static void main(String [] args){
        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike();
        Car car = new Car();    
        Truck truck = new Truck();
        vehicle.startEngine();
        bike.startEngine();
        car.startEngine();
        truck.startEngine();
    }
}