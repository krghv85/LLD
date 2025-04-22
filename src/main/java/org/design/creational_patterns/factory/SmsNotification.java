package org.design.creational_patterns.factory;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a SMS Notification");
    }
}
