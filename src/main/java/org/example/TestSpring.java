package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
//    Следующее видео: "Аннотации. Введение"
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer player = new MusicPlayer(music);
//        player.playMusic();

        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.playMusic(Kinds.JAZZ));

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        context.close();
    }
}
