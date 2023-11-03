import java.util.ArrayList;

public class Dealership {
    public String name, address, phone;
    public ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return null;
    }

    public void addVehicle(Vehicle newVehicle){

    }

    public void removeVehicle(Vehicle newVehicle){

    }
}
