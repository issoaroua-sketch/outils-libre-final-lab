// src/main/java/com/example/DiscountCode.java
package com.example;

public enum DiscountCode {
    NONE(0),
    SAVE10(10),
    SAVE20(20);
    
    private final int discountAmount;
    
    DiscountCode(int discountAmount) {
        this.discountAmount = discountAmount;
    }
    
    public int getDiscountAmount() {
        return discountAmount;
    }
}