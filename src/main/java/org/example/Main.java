package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a Car c1 to store vehicles
       Car c1 = new Car("Generic", "Vehicle", 50.0,5);
        System.out.println("Generic Vehicle Information:");
        c1.displayCarInfo();
        System.out.println("------------------------");

        // Create a Car c2 to store vehicles
        Car c2 = new Car("Honda", "Accord", 120.0, 4);
        System.out.println("Generic Vehicle Information:");
        c2.displayCarInfo();
        System.out.println("------------------------");

// Create a list to store vehicles
        List<Vehicle> vehicleList = new ArrayList<>();

        RentalAgency rentalAgency = new RentalAgency(vehicleList);
       // ajouter la voiture c2
        rentalAgency.addVehicle(c2);
        /*  afficher liste des car   */
        System.out.println("List des Car:");

     rentalAgency.displayAvailableVehicles();






    }
}