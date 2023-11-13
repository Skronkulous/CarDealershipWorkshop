package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractTest {
    @Test // Contract Test
    public void testSalesContractGetTotalPrice() {
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Sedan", "Blue", 5000, 25000.0);
        SalesContract salesContract = new SalesContract("2023-11-13", "Sneak", "sneakditz@example.com", vehicle, false);
        assertEquals(25000.0 + 25000.0 * 0.05 +100 + 295, salesContract.getTotalPrice());
    }

    @Test
    public void testLeaseContractGetMonthlyPayment() {
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Sedan", "Blue", 5000, 25000.0);
        LeaseContract leaseContract = new LeaseContract("2023-11-13", "Sneak", "sneakditz@example.com", vehicle);
        assertEquals((12500.0+ 1750.0) * 1.04 / 36, leaseContract.getMonthlyPayment());
    }
}