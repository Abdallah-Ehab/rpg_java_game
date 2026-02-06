package capabilities;

import entities.Actor;
import vector.Position;

public interface Movable {
    float getSpeed();
    default void move(Actor actor){
        Position currentPosition = actor.getEntity().getPosition();
        float x = actor.getDirection().getX()*getSpeed();
        float y = actor.getDirection().getY()*getSpeed();
        actor.getEntity().setPosition(currentPosition.add(new Position(x,y)));
    }
}
