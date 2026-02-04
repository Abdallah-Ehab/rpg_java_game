package entities;

import vector.Position;

public class Enemy implements Character,NonPlayable,Dynamic{
    private final Entity entity;
    public Enemy(Entity entity){
        this.entity = entity;
    }

    @Override
    public void move(){
        Position position = entity.getPosition();
        this.entity.setPosition(new Position(position.getX() + 20, position.getY() + 20));
    }

    @Override
    public String speak() {
        return "Hi I'm evil and my name proudly is " + this.entity.getName();
    }

    @Override
    public void update() {
        this.move();
    }
}
