package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import peaksoft.model.Animal;
import peaksoft.model.Timer;

@Configuration
@ComponentScan(basePackages = "peaksoft")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean
    public Animal myAnimal(){

        return new Animal();
    }
    @Bean
    public Timer timer(){

        return new Timer();
    }
}
