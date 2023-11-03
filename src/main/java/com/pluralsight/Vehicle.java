package com.pluralsight;

public class Vehicle {
    public double price;
    public int vin, year, odometer;
    public String make, model, vehicleType, color;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.price = price;
        this.vin = vin;
        this.year = year;
        this.odometer = odometer;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
    }

}
