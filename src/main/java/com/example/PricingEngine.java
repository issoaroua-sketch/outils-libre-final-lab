// src/main/java/com/example/PricingEngine.java
package com.example;

public class PricingEngine {
    private final DiscountCalculator discountCalculator = new DiscountCalculator();
    private final TaxCalculator taxCalculator = new TaxCalculator();
    
    public double calculate(double price, int quantity, CustomerType customerType, DiscountCode discountCode) {
        double subtotal = price * quantity;
        double discounted = discountCalculator.applyCustomerDiscount(subtotal, customerType);
        discounted = discountCalculator.applyDiscountCode(discounted, discountCode);
        return taxCalculator.applyTax(discounted);
    }
}