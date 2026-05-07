// src/main/java/com/example/PricingEngine.java
package com.example;

public class PricingEngine {
    public double calculate(double price, int quantity, String customerType, String discountCode) {
        double subtotal = price * quantity;
        
        // Bad: Magic numbers + String comparison
        if (customerType.equals("VIP")) {
            subtotal *= 0.8; // 20% VIP discount
        }
        
        // Bad: More magic numbers + if-else chain
        if (discountCode.equals("SAVE10")) {
            subtotal -= 10;
        } else if (discountCode.equals("SAVE20")) {
            subtotal -= 20;
        }
        
        // Bad: Tax hardcoded
        double tax = subtotal * 0.19;
        return subtotal + tax;
    }
}