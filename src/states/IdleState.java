package states;

import entities.Actor;

public class IdleState implements State {

    @Override
    public void update(Actor actor){
        actor.speak();
    }
}
