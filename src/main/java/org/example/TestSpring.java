package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
//    Следующее видео: "Аннотации. Введение"
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();
        context.close();
    }
}
