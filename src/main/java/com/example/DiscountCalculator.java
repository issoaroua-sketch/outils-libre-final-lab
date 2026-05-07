// src/main/java/com/example/DiscountCalculator.java
package com.example;

public class DiscountCalculator {
    
    public double applyCustomerDiscount(double subtotal, String customerType) {
        if ("VIP".equals(customerType)) {
            return subtotal * 0.8; // 20% VIP discount
        }
        return subtotal;
    }
    
    public double applyDiscountCode(double subtotal, String discountCode) {
        return switch (discountCode) {
            case "SAVE10" -> subtotal - 10;
            case "SAVE20" -> subtotal - 20;
            default -> subtotal;
        };
    }
}
