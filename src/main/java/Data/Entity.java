package Data;

import Services.Drawable;

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
