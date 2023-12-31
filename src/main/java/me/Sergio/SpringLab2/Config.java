package me.Sergio.SpringLab2;

import me.Sergio.SpringLab2.items.Item;
import me.Sergio.SpringLab2.items.Sunglasses;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class Config {
    @Value("${small_pocket.height}")
    int smallPocketHeight;

    @Value("${small_pocket.width}")
    int smallPocketWidth;

    @Value("${large_pocket.height}")
    int largePocketHeight;

    @Value("${large_pocket.width}")
    int largePocketWidth;

    @Value("${sunglasses.height}")
    int sunglassesHeight;

    @Value("${sunglasses.width}")
    int sunglassesWidth;

    @Value("${sunglasses.name}")
    String sunglassesName;
    @Bean
    public Pocket smallPocket(){
        return new Pocket(smallPocketHeight, smallPocketWidth);
    }

    @Bean
    public Pocket largePocket(){
        var pocket = new Pocket(largePocketHeight, largePocketWidth);
        pocket.setItem(sunglasses());
        return pocket;
    }

    @Bean
    public Item sunglasses(){
        return new Sunglasses(sunglassesName, sunglassesHeight, sunglassesWidth);
    }
}
