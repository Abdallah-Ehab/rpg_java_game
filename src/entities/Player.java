package entities;

import vector.Position;

public class Player implements Character,Playable,Dynamic {
    private final Entity entity;
    public Player(Entity entity) {
        this.entity = entity;
    }
    @Override
    public void move(){
        Position position = entity.getPosition();
        this.entity.setPosition(new Position(position.getX() + 10, position.getY() + 10));
    }

    @Override
    public String speak() {
        return "Hi my name is " + this.entity.getName();
    }

    @Override
    public void update() {
        this.move();
        System.out.println(this.entity.getPosition());
    }
}
