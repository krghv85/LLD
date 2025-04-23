package org.design.structural_patterns.adapter;

public class Client {

    public static void main(String[] arg){
        AdapterMediaPlayer adapterMediaPlayer = new AdapterMediaPlayer();
        adapterMediaPlayer.mp3Player();
    }
}
