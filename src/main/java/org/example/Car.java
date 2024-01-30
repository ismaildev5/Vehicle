package org.example;

public class Car extends Vehicle{

private final int numberOfDoors ;
    public Car(String make, String model, Double rentalPrice, int numberOfDoors) {
        super(make, model, rentalPrice);
        this.numberOfDoors = numberOfDoors ;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
public void displayCarInfo(){
    displayVehicleInfo() ;
    System.out.println("Numbers of Doors : "+numberOfDoors);

}


}
