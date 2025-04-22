package org.design.creational_patterns.abstract_factory;

public class Android  implements Phone{
    @Override
    public void create() {
        System.out.print("Creating Android Phones......");
    }
}
