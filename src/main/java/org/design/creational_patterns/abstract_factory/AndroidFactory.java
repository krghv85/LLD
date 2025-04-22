package org.design.creational_patterns.abstract_factory;

public class AndroidFactory  implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new Android();
    }
}
