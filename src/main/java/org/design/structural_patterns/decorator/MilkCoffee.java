package org.design.structural_patterns.decorator;

public class MilkCoffee extends CoffeeDecorator{

    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", Milk";
    }
}
