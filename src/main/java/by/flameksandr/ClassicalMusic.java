package by.flameksandr;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {

    public ClassicalMusic() {
    }
    @Override
    public String getSong() {
        return "Playing Hungarian rhapsody";
    }
}
