package me.Sergio.SpringLab2.equipment;

import org.springframework.stereotype.Component;

@Component
public class Helmet extends Equipment {
    Helmet() {
        System.out.println("Helmet bean is created");
    }
}
