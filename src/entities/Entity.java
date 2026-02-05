package entities;

import states.IdleState;
import states.State;
import vector.Position;

import java.awt.*;


public class Entity{
    private String name;
    private int health;
    private Position position;
    private boolean isAlive;
    public Entity(String name, int health, Position position, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.position = position;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isAlive() {
        return isAlive;
    }
    public void setPosition(Position position){
        this.position = position;
    }

}