package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

import static org.example.Kinds.*;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("jazzMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(Kinds kind) {
        Random random = new Random();
        int songNumber = random.nextInt(2);
        String song;
        if (kind == CLASSICAL) {
            song = music1.getSongs().get(songNumber);
        } else if (kind == ROCK) {
            song = music2.getSongs().get(songNumber);
        } else {
            song = music3.getSongs().get(songNumber);
        }
        return song;
    }
}
