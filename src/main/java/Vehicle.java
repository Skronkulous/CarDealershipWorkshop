public class Vehicle {
    public double price;
    public int vin, year, odometer;
    public String make, model, vehicleType, color;

    public Vehicle(double price, int vin, int year, int odometer, String make, String model, String vehicleType, String color) {
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
