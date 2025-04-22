package org.design.creational_patterns.factory;

public class Client {

    public static void main(String arg[]){

        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
