package org.design.structural_patterns.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDesc() {
        return "Simple Coffee";
    }



}
