package org.design.structural_patterns.adapter;

public class AdapterMediaPlayer implements MediaPlayer{

    private AdvanceMediaPlayer mp4Player;

    public AdapterMediaPlayer(){
        mp4Player = new Mp4Player();
    }

    @Override
    public void mp3Player() {
        mp4Player.mp4Player();
    }
}
