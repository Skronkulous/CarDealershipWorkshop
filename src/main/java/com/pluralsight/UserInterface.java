package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

import static com.pluralsight.Dealership.*;
import static com.pluralsight.DealershipFileManager.*;

public class UserInterface {
    public static Dealership newDealership;
    public static Scanner input = new Scanner(System.in);
    public void display(){
        initialize();
        System.out.print("Welcome to E & S Used Cars! \nPlease enter a menu option (1 - 9):\n\t1)Sort Cars by Price\n\t2)Sort Cars by Make & Model\n\t3)Sort Cars by Year\n\t4)Sort Cars by Color\n\t5)Sort Cars by Mileage\n\t6)Sort Cars by Vehicle Type\n\t7)Retrieve All Available Vehicles\n\t8)Add a Vehicle to Dealership\n\t9)Remove a Vehicle from Dealership\nUser Input: ");
        String userInput = input.nextLine();
        switch (userInput){
            case "1":
                processGetVehiclesByPriceRequest();
                break;
            case "2":
                processGetVehiclesByMakeModelRequest();
                break;
            case "3":
                processGetVehiclesByYearRequest();
                break;
            case "4":
                processGetVehiclesByColorRequest();
                break;
            case "5":
                processGetVehiclesByMileageRequest();
                break;
            case "6":
                processGetVehiclesByTypeRequest();
                break;
            case "7":
                processGetAllVehiclesRequest();
                break;
            case "8":
                processAddVehicleRequest();
                break;
            case "9":
                processRemoveVehicleRequest();
                break;
            default:
                System.out.println("Please enter a valid option (1-9).");
                display();
                break;
        }
    }

    private void initialize(){
        newDealership = getDealership();
    }

    public void processGetVehiclesByPriceRequest(){

    }

    public void processGetVehiclesByMakeModelRequest(){

    }

    public void processGetVehiclesByYearRequest(){

    }

    public void processGetVehiclesByColorRequest(){

    }

    public void processGetVehiclesByMileageRequest(){

    }

    public void processGetVehiclesByTypeRequest(){

    }

    public void processGetAllVehiclesRequest(){
        System.out.println("List of All Vehicles: ");
        displayVehicles(getAllVehicles());
    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }

    public void displayVehicles(ArrayList<Vehicle> vehicleList){
        for(Vehicle vehicle: vehicleList){
            System.out.println("VIN: " + vehicleList.get(0) + " | Year: " + vehicleList.get(1) + " | Make: " + vehicleList.get(2) + " | Model: " + vehicleList.get(3) + " | Vehicle Type: " + vehicleList.get(4) + " | Color: " + vehicleList.get(5) + " | Odometer: " + vehicleList.get(6) + " | Price: " + vehicleList.get(7) + " |");
        }
    }
}
