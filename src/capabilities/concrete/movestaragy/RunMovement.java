package capabilities.concrete.movestaragy;

import capabilities.Movable;
import entities.Actor;
import vector.Position;

public class RunMovement implements Movable{
    @Override
    public float getSpeed() {
        return 5.0f;
    }
}
