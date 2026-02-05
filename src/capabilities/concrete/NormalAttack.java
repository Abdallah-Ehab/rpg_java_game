package capabilities.concrete;

import capabilities.Attackable;
import entities.Entity;

public class NormalAttack implements Attackable {
    @Override
    public void attack(Entity entity) {
        System.out.println(entity.getName() + " performs a normal attack!");
    }
}
