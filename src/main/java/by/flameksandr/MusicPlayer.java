package by.flameksandr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {

    @Value("${music.name}")
    private String name;
    @Value("${music.volume}")
    private int volume;
    private final Music music;

    public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }

    public String playMusic() {
        return "Plying: " + music.getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
