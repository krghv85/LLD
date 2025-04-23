package org.design.structural_patterns.decorator;

public class Client {

    public static void main(String[] arg){

        Coffee coffee = new SimpleCoffee();

        coffee = new MilkCoffee(coffee);
        coffee = new SugarCoffee(coffee);

        System.out.println("Desc: $" + coffee.getDesc());
        System.out.println("Cost: $" + coffee.getCost());

    }
}
