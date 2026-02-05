package entities;

import states.IdleState;
import states.State;
import vector.Position;

public class Enemy implements NonPlayable {
    private final Actor actor;

    public Enemy(Actor actor) {
        this.actor = actor;
    }


    public void update() {
        this.actor.update();
    }
}
