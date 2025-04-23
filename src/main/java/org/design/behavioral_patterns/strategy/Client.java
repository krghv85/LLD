package org.design.behavioral_patterns.strategy;

public class Client {

    public static void main(String[] args) {
    ShoppingCart shoppingCart = new ShoppingCart(new CreditCardPayment());
        shoppingCart.checkout(100);

        shoppingCart.setStrategyPayment(new UpiPayment());
        shoppingCart.checkout(200);

        shoppingCart.setStrategyPayment(new PaytemPayment());
        shoppingCart.checkout(500);

    }
}
