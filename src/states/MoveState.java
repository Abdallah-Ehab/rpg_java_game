package states;

import entities.Actor;

public class MoveState implements State{
    @Override
    public void update(Actor actor){
        actor.move();

    }
}
