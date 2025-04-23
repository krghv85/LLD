package org.design.behavioral_patterns.strategy;

public class UpiPayment implements StrategyPayment{
    @Override
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
