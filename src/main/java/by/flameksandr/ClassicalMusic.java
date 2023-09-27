package by.flameksandr;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {

    public ClassicalMusic() {
    }

    public void initialization() {
        System.out.println("Initialization");
    }

    public void destruction() {
        System.out.println("Destruction");
    }

    @Override
    public String getSong() {
        return "Playing Hungarian rhapsody";
    }
}
