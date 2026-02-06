package entities;

import capabilities.Attackable;
import capabilities.Movable;
import capabilities.Speakable;
import states.IdleState;
import states.State;
import vector.Position;

public class Actor{
    private final Entity entity;
    private Speakable speakable;
    private Movable movable;
    private Attackable attackable;
    private State state;
    private Position Direction;

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

    public Position getDirection() {
        return Direction;
    }

    public void setDirection(Position direction) {
        Direction = direction;
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


    public void speak(){
        if(speakable != null){
            speakable.speak(this);
        }
    }
    public void attack(){
        if(attackable != null){
            attackable.attack(this);
        }
    }
    public void move(){
        if(movable != null){
        movable.move(this);
        }
    }
    public void update(){
        this.state.update(this);
    }
}
