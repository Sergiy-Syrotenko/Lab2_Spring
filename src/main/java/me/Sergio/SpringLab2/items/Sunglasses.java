package me.Sergio.SpringLab2.items;

public class Sunglasses extends Item {
    public Sunglasses(String name, int height, int width) {
        super(name, height, width);
        System.out.println("Sunglasses bean is created");
    }
}
