package states;

import entities.Movable;

public class WalkState implements State<Movable>{
    @Override
    public void update(Movable entity){
        entity.move();
    }
}
