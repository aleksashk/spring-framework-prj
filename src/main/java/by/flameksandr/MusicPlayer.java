package by.flameksandr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {

    private String name;
    private int volume;
    private Music music;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }


    public Music getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println("Plying: " + music.getSong());
    }
}
