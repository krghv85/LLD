package org.design.structural_patterns.proxy;

public class Client {

    public static void main(String[] arg){
        VideoService videoService = new VideoServiceProxy();
        videoService.watchVideo("The Matrix");
    }
}
