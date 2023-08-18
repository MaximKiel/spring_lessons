package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
//    Следующее видео: "Spring MVC. Теория"
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();
        context.close();
    }
}
