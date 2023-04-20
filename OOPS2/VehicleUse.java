package OOPS2;
class Vehicle{
    public Vehicle(){
        System.out.println("This is vehicle's constructor");
    }
     String color;
    int maxspeed;
    public void print(){
        System.out.println("Vehicle"+"color"+ color+"maxspeed"+maxspeed);
    }
}
class bicycle extends Vehicle{
    int wheels;
}
class car extends Vehicle{
    public car(){
        System.out.println("This is car's constructor");
    }
    int numDoors;

}
public class VehicleUse {
    public static void main (String args[]){
       Vehicle v = new Vehicle();
       car c = new car();
    }
}
