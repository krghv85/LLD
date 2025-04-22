package org.design.creational_patterns.singleton;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){
        System.out.println("Singleton instance created");
    }

    public static synchronized Singleton getINSTANCE(){
        if (INSTANCE == null)
            INSTANCE = new Singleton();

        return INSTANCE;
    }
}
