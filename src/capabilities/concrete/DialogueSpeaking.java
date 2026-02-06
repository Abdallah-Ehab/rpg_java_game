package capabilities.concrete;

import capabilities.Speakable;
import entities.Actor;

public class DialogueSpeaking implements Speakable {

    @Override
    public void speak(Actor actor) {
        System.out.println(actor.getEntity().getName() + " says: Hello, how are you?");

    }
}
