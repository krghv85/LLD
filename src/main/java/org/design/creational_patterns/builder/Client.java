package org.design.creational_patterns.builder;

public class Client {
    public static void main(String []arg){
        User user = new User.Builder()
                .name("Kamal")
                .age(32)
                .build();
        System.out.print(user);
    }
}
