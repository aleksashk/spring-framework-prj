package by.flameksandr;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music{

    public RockMusic() {
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
