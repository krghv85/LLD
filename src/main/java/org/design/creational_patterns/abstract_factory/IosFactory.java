package org.design.creational_patterns.abstract_factory;

public class IosFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new Ios();
    }
}
