package org.design.creational_patterns.factory;

public class NotificationFactory {
    public static Notification createNotification(String type){

        if (type.isBlank() || type == null)
            return null;

        return switch (type){
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Unknown notification type");
        };
    }
}
