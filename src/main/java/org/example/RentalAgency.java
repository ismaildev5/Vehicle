package org.example;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private  List<Vehicle> vehicleFleet;

    public RentalAgency(List<Vehicle> vehicleFleet) {
        this.vehicleFleet = vehicleFleet;
    }
    // Method to add a vehicle to the fleet
    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }
    // Method to rent a vehicle
    public void rentVehicle(Vehicle vehicle) {
        if (vehicleFleet.contains(vehicle)) {
            vehicleFleet.remove(vehicle);
            System.out.println("Vehicle rented successfully.");
        } else {
            System.out.println("Vehicle not found in the fleet.");
        }
    }
    // Method to display available vehicles
    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : vehicleFleet) {
            vehicle.displayVehicleInfo();
            System.out.println("------------------------");
        }
    }






}
