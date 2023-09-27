package by.flameksandr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Autowired
//    @Qualifier("classicalMusic")
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Plying: " + music1.getSong() + " " + music2.getSong();
    }
}
