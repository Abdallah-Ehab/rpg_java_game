package entities;

import states.IdleState;
import states.State;
import vector.Position;

public class Player implements Playable{
    private final Actor actor;

    public Player(Actor actor) {
        this.actor = actor;
    }
    void update(){
        this.actor.update();
    }
}
