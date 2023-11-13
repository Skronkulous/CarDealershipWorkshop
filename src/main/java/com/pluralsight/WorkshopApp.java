package com.pluralsight;

import static com.pluralsight.ContractFileManager.getContracts;
import static com.pluralsight.UserInterface.*;

public class WorkshopApp {
    public static Dealership newDealership;
    public static void main(String[] args) {
        initialize();
        getContracts();
        display();
    }
}
