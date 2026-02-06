package capabilities.concrete;

import capabilities.Attackable;
import entities.Actor;

public class NormalAttack implements Attackable {
    @Override
    public void attack(Actor actor) {
        System.out.println(actor.getEntity().getName() + " performs a normal attack!");
    }
}
