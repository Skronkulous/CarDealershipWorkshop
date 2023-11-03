package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

import static com.pluralsight.Dealership.inventory;

public class DealershipFileManager {
    public static Dealership getDealership(){
        try{
            FileReader fr = new FileReader("src/main/resources/inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            String tempInfo, dealership = br.readLine();
            String[] splitDealership = dealership.split("\\|");
            Dealership newDealership = new Dealership (splitDealership[0], splitDealership[1], splitDealership[2]);
            while((tempInfo = br.readLine()) != null){
                String[] splitInfo = tempInfo.split("\\|");
                int vin = Integer.parseInt(splitInfo[0]);
                int year = Integer.parseInt(splitInfo[1]);
                String make = splitInfo[2];
                String model = splitInfo[3];
                String vehicleType = splitInfo[4];
                String color = splitInfo[5];
                int odometer = Integer.parseInt(splitInfo[6]);
                double price = Double.parseDouble(splitInfo[7]);
                Vehicle newVehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                inventory.add(newVehicle);
            }
            fr.close();
            br.close();
            return newDealership;
        }
        catch(Exception fileError){
            System.out.println("Something has went wrong with the file path. Please update and try again.");
            fileError.printStackTrace();
            return null;
        }
    }

    public static void saveDealership(){

    }
}
