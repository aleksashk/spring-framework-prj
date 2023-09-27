package by.flameksandr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic music1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic music2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(music1 == music2);
        context.close();

    }
}
