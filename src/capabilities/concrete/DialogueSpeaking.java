package capabilities.concrete;

import entities.Entity;
import entities.Speakable;

public class DialogueSpeaking implements Speakable {

    @Override
    public void speak(Entity entity) {
        System.out.println(entity.getName() + " says: Hello, how are you?");
    }
}
