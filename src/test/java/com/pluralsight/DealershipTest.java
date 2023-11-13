package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {
    @Test // Dealership Test
    public void testGetVehicleByVin() {
        Dealership dealership = new Dealership("E&S Cars", "123 Main St", "111-1234");
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Sedan", "Blue", 5000, 25000.0);
        Vehicle vehicle2 = new Vehicle(67890, 2022, "Honda", "Accord", "Sedan", "Red", 8000, 28000.0);
        dealership.addVehicle(vehicle);
        dealership.addVehicle(vehicle2);

        assertEquals(vehicle, Dealership.getVehicleByVin(12345));
        assertEquals(vehicle2, Dealership.getVehicleByVin(67890));
    }
}