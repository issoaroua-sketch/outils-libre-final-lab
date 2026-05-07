// src/test/java/com/example/PricingEngineTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PricingEngineTest {
    
    private final PricingEngine engine = new PricingEngine();
    
    @Test
    void testRegularCustomerNoDiscount() {
        double result = engine.calculate(100, 1, "REGULAR", "");
        assertEquals(119.0, result, 0.01, "Regular should pay full price + 19% tax");
    }
    
    @Test
    void testVIPDiscount() {
        double result = engine.calculate(100, 1, "VIP", "");
        assertEquals(95.2, result, 0.01, "VIP should get 20% discount + 19% tax");
    }
    
    @Test
    void testSave10Discount() {
        double result = engine.calculate(100, 1, "REGULAR", "SAVE10");
        assertEquals(99.1, result, 0.01, "SAVE10 should deduct $10 + 19% tax");
    }
    
    @Test
    void testSave20Discount() {
        double result = engine.calculate(100, 1, "REGULAR", "SAVE20");
        assertEquals(89.2, result, 0.01, "SAVE20 should deduct $20 + 19% tax");
    }
    
    @Test
    void testVIPWithSave10() {
        double result = engine.calculate(100, 2, "VIP", "SAVE10");
        assertEquals(178.5, result, 0.01, "VIP 20% + SAVE10 -$10 + 19% tax");
    }
    
    @Test
    void testQuantityCalculation() {
        double result = engine.calculate(50, 3, "REGULAR", "");
        assertEquals(178.5, result, 0.01, "3 items x $50 + 19% tax");
    }
}