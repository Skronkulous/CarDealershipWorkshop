package com.pluralsight;

import static com.pluralsight.DealershipFileManager.saveDealership;
import static com.pluralsight.UserInterface.*;

public class WorkshopApp {
    public static Dealership newDealership;
    public static void main(String[] args) {
        initialize();
        display();
    }
}
