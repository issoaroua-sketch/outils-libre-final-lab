// src/main/java/com/example/TaxCalculator.java
package com.example;

public class TaxCalculator {
    private static final double TAX_RATE = 0.19;
    
    public double calculateTax(double amount) {
        return amount * TAX_RATE;
    }
    
    public double applyTax(double amount) {
        return amount + calculateTax(amount);
    }
}