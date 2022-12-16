package activities;

public class Activity1 {
    public static void main(String[] args){
        Car Honda = new Car();
        Honda.make=2014;
        Honda.color="Black";
        Honda.transmission="manual";
        Honda.displayCharacteristics();
        Honda.accelerate();
        Honda.brake();
    }

}
