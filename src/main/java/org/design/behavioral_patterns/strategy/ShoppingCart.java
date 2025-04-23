package org.design.behavioral_patterns.strategy;

public class ShoppingCart {
    private StrategyPayment strategyPayment;

    public ShoppingCart(StrategyPayment strategyPayment){
        this.strategyPayment = strategyPayment;
    }

    public void checkout(int amount){
        strategyPayment.pay(amount);
    }

    public void setStrategyPayment(StrategyPayment strategyPayment){
        this.strategyPayment = strategyPayment;
    }
}
