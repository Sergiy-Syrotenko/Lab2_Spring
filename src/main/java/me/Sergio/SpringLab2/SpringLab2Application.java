package me.Sergio.SpringLab2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLab2Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("me.Sergio.SpringLab2");

        Character character = context.getBean("character", Character.class);
        System.out.printf("\nVest pocket size is %d x %d\n", character.getBody().getPocket().getHeight(), character.getBody().getPocket().getWidth());
        System.out.printf("\nVest pocket contain a %s\n", character.getBody().getPocket().getItem().getName());
        System.out.printf("\nPants pocket size is %d x %d\n", character.getLegs().getPocket().getHeight(), character.getLegs().getPocket().getWidth());
        System.out.printf("\nCharacter's name is %s!\n", character.getName());
    }
}
