package org.design.creational_patterns.abstract_factory;

public class Client {

    public static void main(String[] args) {
        String phoneType = "Ios";
        PhoneFactory phoneFactory;

        if (phoneType.equals("Android")){
            phoneFactory = new AndroidFactory();
        }else {
            phoneFactory = new IosFactory();
        }

        Phone phone = phoneFactory.createPhone();
        phone.create();
    }
}