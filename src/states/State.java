package states;

import entities.Actor;


public interface State {
    void update(Actor actor);
}
