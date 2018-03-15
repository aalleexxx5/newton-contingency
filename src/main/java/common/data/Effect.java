package common.data;


import common.services.Updatable;

public abstract class Effect implements Updatable {
    public abstract void update();
}
