package org.design.structural_patterns.proxy;

public class VideoServiceProxy implements VideoService{

    private RealVideoService realVideoService;

    public VideoServiceProxy(){
        realVideoService = new RealVideoService();
    }

    @Override
    public void watchVideo(String videoName) {
        realVideoService.watchVideo(videoName);
    }
}
