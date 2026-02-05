import gameworld.GameWorld;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        GameWorld gameworld = new GameWorld();

        while(true){
        gameworld.tick();

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}