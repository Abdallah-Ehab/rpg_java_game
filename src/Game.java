import gameworld.GameWorld;
import rendering.gameworld.GamePanel;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class Game {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zelda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        GamePanel world = new GamePanel();
        frame.add(world);
        frame.setVisible(true);


    }
}