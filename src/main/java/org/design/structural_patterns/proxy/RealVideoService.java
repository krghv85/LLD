package org.design.structural_patterns.proxy;

public class RealVideoService implements VideoService{

    @Override
    public void watchVideo(String videoName) {
        System.out.println("Streaming video: " + videoName);
    }
}
