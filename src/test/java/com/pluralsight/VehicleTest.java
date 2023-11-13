package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class VehicleTest {
    @Test // Vehicle Test
    public void testGetPrice() {
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Sedan", "Blue", 5000, 25000.0);
        assertEquals(25000.0, vehicle.getPrice());
    }

    @Test
    public void testSetPrice() {
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Sedan", "Blue", 5000, 25000.0);
        vehicle.setPrice(26000.0);
        assertEquals(26000.0, vehicle.getPrice());
    }

    @Test
    public void testToString() {
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Sedan", "Blue", 5000, 25000.0);
        String expected = "VIN: 12345 | Year: 2020 | Make: Toyota | Model: Camry | Vehicle Type: Sedan | Color: Blue | Odometer: 5000 | Price: 25000.0";
        assertEquals(expected, vehicle.toString());
    }
}