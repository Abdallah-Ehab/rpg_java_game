package states;

import entities.Actor;
import entities.Entity;

public class AttackState {
    public void update(Actor actor){
        actor.getAttackable().attack();
    }
}
