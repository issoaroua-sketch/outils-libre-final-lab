// src/main/java/com/example/DiscountCalculator.java
package com.example;

public class DiscountCalculator {
    
    public double applyCustomerDiscount(double subtotal, CustomerType customerType) {
        return subtotal * customerType.getDiscountMultiplier();
    }
    
    public double applyDiscountCode(double subtotal, DiscountCode discountCode) {
        return subtotal - discountCode.getDiscountAmount();
    }
}