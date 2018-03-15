package main.java.data;



import main.java.services.Drawable;

import java.util.UUID;

public class Entity implements Drawable {
    float[] boundary;
    UUID id;

    public Entity() {
        id = UUID.randomUUID();
    }

    public void draw() {

    }
}
