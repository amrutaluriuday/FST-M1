package activities;

public class Car {
    //class member variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    //constructor
    Car (){
        tyres=4;
        doors=4;
    }
    public void displayCharacteristics (){
        System.out.println("color of a Car:"+ color);
        System.out.println("transmission of a Car:"+ transmission);
        System.out.println("make of a Car:"+ make);
        System.out.println("tyres of a Car:"+ tyres);
        System.out.println("doors of a Car:"+ doors);
    }
    public void accelerate () {
        System.out.println("accelerate of a Car");
    }
    public void brake (){
        System.out.println("brake of a Car");
    }
}



