package org.design.creational_patterns.abstract_factory;

public class Ios implements Phone{
    @Override
    public void create() {
        System.out.print("Creating Ios Phones......");
    }
}
