package by.flameksandr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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
