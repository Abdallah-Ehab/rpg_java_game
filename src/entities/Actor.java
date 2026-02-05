package entities;

import capabilities.Attackable;
import states.IdleState;
import states.State;

public class Actor{
    private final Entity entity;
    private Speakable speakable;
    private Movable movable;
    private Attackable attackable;
    private State state;

    public Actor(Entity entity, Speakable speakable,Movable movable, Attackable attackable) {
        this.entity = entity;
        this.state = new IdleState();
        this.speakable = speakable;
        this.movable = movable;
        this.attackable = attackable;
    }
    public Entity getEntity(){
        return this.entity;
    }

    public Speakable getSpeakable() {
        return speakable;
    }

    public void setSpeakable(Speakable speakable) {
        this.speakable = speakable;
    }

    public Movable getMovable() {
        return movable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    public Attackable getAttackable() {
        return attackable;
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }

    public State getState() {
        return state;
    }

    public void setState(State newState){

        this.state = newState;

    }
    public void update(){
        this.state.update(this);
    }
}
