package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    public String name, address, phone;
    public static ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

    public Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public static ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }

    public static ArrayList<Vehicle> getAllVehicles(){
        ArrayList<Vehicle> newVehicleList = new ArrayList<Vehicle>();
        for(Vehicle vehicle: inventory){
            newVehicleList.add(vehicle);
        }
        return newVehicleList;
    }

    public static void addVehicle(Vehicle newVehicle){

    }

    public static void removeVehicle(Vehicle newVehicle){

    }
}
