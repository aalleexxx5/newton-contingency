package main.java.data;


import main.java.services.Collidable;
import main.java.services.Destructable;
import main.java.services.Updatable;

public class Unit extends Entity implements Updatable, Collidable, Destructable {
    private int health;


    public Enum getHostility() {
        return null;
    }

    public void collidesWith() {

    }

    public void update() {

    }

    public Boolean shouldDestruct() {
        return null;
    }

    public void setDestruct() {

    }
}
