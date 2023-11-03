package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

import static com.pluralsight.Dealership.*;
import static com.pluralsight.DealershipFileManager.*;

public class UserInterface {
    public static Dealership newDealership;
    public static Scanner input = new Scanner(System.in);
    public static void display(){
        initialize();
        System.out.print("Welcome to E & S Used Cars! \nPlease enter a menu option (1 - 10):\n\t1)Sort Cars by Price\n\t2)Sort Cars by Make & Model\n\t3)Sort Cars by Year\n\t4)Sort Cars by Color\n\t5)Sort Cars by Mileage\n\t6)Sort Cars by Vehicle Type\n\t7)Retrieve All Available Vehicles\n\t8)Add a Vehicle to Dealership\n\t9)Remove a Vehicle from Dealership\n\t10)Quit App\nUser Input: ");
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
            case "10":
                System.out.println("\nThank you, see you again soon! ");
                break;
            default:
                System.out.println("\nPlease enter a valid option (1-10).\n");
                display();
                break;
        }
    }

    private static void initialize(){
        newDealership = getDealership();
    }

    public static void processGetVehiclesByPriceRequest(){

    }

    public static void processGetVehiclesByMakeModelRequest(){

    }

    public static void processGetVehiclesByYearRequest(){

    }

    public static void processGetVehiclesByColorRequest(){

    }

    public static void processGetVehiclesByMileageRequest(){

    }

    public static void processGetVehiclesByTypeRequest(){

    }

    public static void processGetAllVehiclesRequest(){
        System.out.println("\nList of All Vehicles: ");
        displayVehicles(getAllVehicles());
    }

    public static void processAddVehicleRequest(){

    }

    public static void processRemoveVehicleRequest(){

    }

    public static void displayVehicles(ArrayList<Vehicle> vehicleList){
        for(Vehicle vehicle: vehicleList){
            System.out.println("VIN: " + vehicle.getVin() + " | Year: " + vehicle.getYear() + " | Make: " + vehicle.getMake() + " | Model: " + vehicle.getModel() + " | Vehicle Type: " + vehicle.getVehicleType() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getOdometer() + " | Price: " + vehicle.getPrice() + " |");
        }
        System.out.println("\nReturning to the main menu...\n");
        display();
    }
}
