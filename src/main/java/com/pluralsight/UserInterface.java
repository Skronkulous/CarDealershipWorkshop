package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

import static com.pluralsight.WorkshopApp.*;
import static com.pluralsight.Dealership.*;
import static com.pluralsight.DealershipFileManager.*;

public class UserInterface {
    public static Scanner input = new Scanner(System.in);
    public static void display(){
        initialize();
        System.out.print("Welcome to E & S Used Cars! \nPlease enter a menu option (1 - 10):\n\t1)Sort Cars by Price\n\t2)Sort Cars by Make & Model\n\t3)Sort Cars by Year\n\t4)Sort Cars by Color\n\t5)Sort Cars by Mileage\n\t6)Sort Cars by Vehicle Type\n\t7)Retrieve All Available Vehicles\n\t8)Add a Vehicle to Dealership\n\t9)Remove a Vehicle from Dealership\n\t10)Quit App\nUser Input: ");
        String userInput = input.nextLine();
        input.reset();
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

    public static void initialize(){
        newDealership = getDealership();
    }

    public static void processGetVehiclesByPriceRequest(){
        try{
            System.out.println("Please enter the minimum price for your search: $");
            double minPrice = input.nextDouble();
            System.out.println("Please enter the maximum price for your search: $");
            double maxPrice = input.nextDouble();
            input.reset();
            System.out.println("\nList of All Vehicles between $" + minPrice + " - $" + maxPrice + ":");
            displayVehicles(getVehiclesByPrice(minPrice, maxPrice));
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid price (Ex: $1633.23).\n");
            processGetVehiclesByPriceRequest();
        }
    }

    public static void processGetVehiclesByMakeModelRequest(){
        try{
            System.out.println("Please enter the vehicle make for your search: ");
            String make = input.nextLine();
            System.out.println("Please enter the vehicle model for your search: ");
            String model = input.nextLine();
            input.reset();
            System.out.println("\nList of All " + make + " " + model + "s:");
            displayVehicles(getVehiclesByMakeModel(make, model));
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid make or model (Ex: Ford Explorer).\n");
            processGetVehiclesByMakeModelRequest();
        }
    }

    public static void processGetVehiclesByYearRequest(){
        try{
            System.out.println("Please enter the minimum year for your search: ");
            int minYear = input.nextInt();
            System.out.println("Please enter the maximum year for your search: ");
            int maxYear = input.nextInt();
            input.reset();
            System.out.println("\nList of All Vehicles between " + minYear + " - " + maxYear + ":");
            displayVehicles(getVehiclesByYear(minYear, maxYear));
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid year (Ex: 2004).\n");
            processGetVehiclesByYearRequest();
        }
    }

    public static void processGetVehiclesByColorRequest(){
        try{
            System.out.println("Please enter the vehicle color for your search: ");
            String color = input.nextLine();
            input.reset();
            System.out.println("\nList of All " + color + " vehicles:");
            displayVehicles(getVehiclesByColor(color));
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid color (Ex: Red).\n");
            processGetVehiclesByColorRequest();
        }
    }

    public static void processGetVehiclesByMileageRequest(){
        try{
            System.out.println("Please enter the minimum mileage for your search: ");
            int minMileage = input.nextInt();
            System.out.println("Please enter the maximum mileage for your search: ");
            int maxMileage = input.nextInt();
            input.reset();
            System.out.println("\nList of All Vehicles with mileage between " + minMileage + " - " + maxMileage + ":");
            displayVehicles(getVehiclesByMileage(minMileage, maxMileage));
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid mileage (Ex: 56263).\n");
            processGetVehiclesByMileageRequest();
        }
    }

    public static void processGetVehiclesByTypeRequest(){
        try{
            System.out.println("Please enter the vehicle type for your search: ");
            String vehicleType = input.nextLine();
            input.reset();
            System.out.println("\nList of All " + vehicleType + " vehicles:");
            displayVehicles(getVehiclesByType(vehicleType));
        }
        catch(Exception inputError){
            System.out.println("\nPlease enter a valid vehicle type (Ex: SUV).\n");
            processGetVehiclesByTypeRequest();
        }
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
