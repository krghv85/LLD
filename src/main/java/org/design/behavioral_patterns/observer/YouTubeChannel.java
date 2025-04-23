package org.design.behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    private List<Observer> observerList = new ArrayList<>();

    public void uploadVideo(String videoTitle){
        System.out.println("Uploading: " + videoTitle);
        notifyObservers("New Video: " + videoTitle);
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
      for (Observer observer : observerList){
          observer.update(message);
      }
    }
}
