package capabilities.concrete;

import entities.Entity;
import entities.Movable;
import vector.Position;

public class WalkMovement implements Movable {
    @Override
    public void move(Entity entity) {
        entity.setPosition(new Position(entity.getPosition().getX() + 1,entity.getPosition().getY() + 1)); // Move the entity by increasing its position by 1
    }
}
