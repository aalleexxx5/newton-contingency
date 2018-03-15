package Data;

import Services.Collidable;
import Services.Destructable;
import Services.Updatable;

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
