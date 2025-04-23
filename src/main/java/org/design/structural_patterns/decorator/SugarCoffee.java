package org.design.structural_patterns.decorator;

public class SugarCoffee extends CoffeeDecorator{

    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDesc() {
        return super.getDesc()+ ", Sugar";
    }
}
