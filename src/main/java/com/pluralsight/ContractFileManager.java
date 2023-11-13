package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import static com.pluralsight.Contract.contractList;

public class ContractFileManager {
    public static void getContracts(){
        try{
            FileReader fr = new FileReader("src/main/resources/contracts.csv");
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            String tempInfo;
            boolean isFinanced = true;
            while((tempInfo = br.readLine()) != null){
                String[] splitInfo = tempInfo.split("\\|");
                if(splitInfo[0].equalsIgnoreCase("sale")){
                    if(splitInfo[16].equals("no"))
                        isFinanced = false;
                    Vehicle tempVehicle = new Vehicle(Integer.parseInt(splitInfo[4]), Integer.parseInt(splitInfo[5]), splitInfo[6], splitInfo[7], splitInfo[8], splitInfo[9], Integer.parseInt(splitInfo[10]), Double.parseDouble(splitInfo[11]));
                    SalesContract newSalesContract = new SalesContract(splitInfo[1], splitInfo[2], splitInfo[3], tempVehicle, isFinanced);
                    contractList.add(newSalesContract);
                }
                else{
                    Vehicle tempVehicle = new Vehicle(Integer.parseInt(splitInfo[4]), Integer.parseInt(splitInfo[5]), splitInfo[6], splitInfo[7], splitInfo[8], splitInfo[9], Integer.parseInt(splitInfo[10]), Double.parseDouble(splitInfo[11]));
                    LeaseContract newLeaseContract = new LeaseContract(splitInfo[1], splitInfo[2], splitInfo[3], tempVehicle);
                    contractList.add(newLeaseContract);
                }
            }
            fr.close();
            br.close();
        }
        catch(Exception fileError){
            System.out.println("Something has went wrong with the file path. Please update and try again.");
            fileError.printStackTrace();
        }
    }

    public static void saveContract(Contract newContract){
        try{
            FileWriter fw = new FileWriter("src/main/resources/contracts.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            String tempFinanced = "NO";
            double monthlyCost = 0.00;
            if(newContract instanceof SalesContract){
                if(((SalesContract) newContract).isFinanced()){
                    tempFinanced = "YES";
                    monthlyCost = ((SalesContract) newContract).getMonthlyPayment();
                }
                String saleWrite = ("SALE|" + newContract.getDate() + "|" + newContract.getName() + "|" + newContract.getEmail() + "|" + newContract.getVehicleSold().getVin() + "|" + newContract.getVehicleSold().getYear() + "|" + newContract.getVehicleSold().getMake() + "|" + newContract.getVehicleSold().getModel() + "|" + newContract.getVehicleSold().getVehicleType() + "|" + newContract.getVehicleSold().getColor() + "|" + newContract.getVehicleSold().getOdometer() + "|" + newContract.getVehicleSold().getPrice() + "|" + ((SalesContract) newContract).getSalesTax() + "|" + ((SalesContract) newContract).getRecordingFee() + "|" + ((SalesContract) newContract).getProcessingFee() + "|" + ((SalesContract) newContract).getTotalPrice() + "|" + tempFinanced + "|" + monthlyCost);
                bw.write(saleWrite);
            }
            else{
                String leaseWrite = ("LEASE|" + newContract.getDate() + "|" + newContract.getName() + "|" + newContract.getEmail() + "|" + newContract.getVehicleSold().getVin() + "|" + newContract.getVehicleSold().getYear() + "|" + newContract.getVehicleSold().getMake() + "|" + newContract.getVehicleSold().getModel() + "|" + newContract.getVehicleSold().getVehicleType() + "|" + newContract.getVehicleSold().getColor() + "|" + newContract.getVehicleSold().getOdometer() + "|" + newContract.getVehicleSold().getPrice() + "|" + ((LeaseContract) newContract).getExpectedEndValue() + "|" + ((LeaseContract) newContract).getLeaseFee() + "|" + ((LeaseContract) newContract).getTotalPrice() + "|" + ((LeaseContract) newContract).getMonthlyPayment());
                bw.write(leaseWrite);
            }
            bw.close();
        }
        catch(Exception fileError){
            System.out.println("Something has went wrong with the file path. Please update and try again.");
            fileError.printStackTrace();
        }
    }
}
