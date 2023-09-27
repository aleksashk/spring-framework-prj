package by.flameksandr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.flameksandr")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic musicBean(){
        return new ClassicalMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicBean());
    }
}
