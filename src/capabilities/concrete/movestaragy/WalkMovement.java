package capabilities.concrete.movestaragy;

import capabilities.Movable;
import entities.Actor;
import vector.Position;

public class WalkMovement implements Movable {
    @Override
    public float getSpeed() {
        return 2.0f;
    }

}
