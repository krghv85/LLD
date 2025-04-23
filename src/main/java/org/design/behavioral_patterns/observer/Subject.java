package org.design.behavioral_patterns.observer;

public interface Subject {
    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notifyObservers(String message);
}
