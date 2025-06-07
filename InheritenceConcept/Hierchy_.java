package InheritenceConcept;
// BASE CLASS
class Vehicle{
    // methods
    public void startEngine(){
        System.out.println("vehicle needs engine to start.");
    }
    public void stopEngine(){
        System.out.println("vehicle stops");
    }
}
// sub class
class Car extends Vehicle{
    // inheritance
  
    // method drive
    public void drive(){
          super.startEngine();
            
        System.out.println("Car drives.");
        super.stopEngine();
    }
}
class Motorcycle extends Vehicle{
    // method ride
    public void ride(){
        super.startEngine();
 
        System.out.println("Motorcycle needs to ride.");
        super.stopEngine();
    }
}
public class Hierchy_ {
    public static void main(String[] args) {
        // object of motorcycle
        Motorcycle objMotorcycle = new Motorcycle();
        objMotorcycle.ride();

        // object of car
        Car objCar = new Car();
        
        objCar.drive();
        
    }

    
}