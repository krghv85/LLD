package org.design.creational_patterns.factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}
