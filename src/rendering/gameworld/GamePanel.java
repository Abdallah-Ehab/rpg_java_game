package rendering.gameworld;

import capabilities.Movable;
import capabilities.concrete.movestaragy.RunMovement;
import capabilities.concrete.movestaragy.WalkMovement;
import entities.Actor;
import entities.Entity;
import states.MoveState;
import vector.Position;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class GamePanel extends JPanel {
    private Actor player;
    private BufferedImage playerImage;
    private BufferedImage backgroundImage;
    boolean[] keys = new boolean[5];
    private final Movable walkMovement = new WalkMovement();
    private final Movable runMovement  = new RunMovement();

    public GamePanel(){
        this.setBackground(Color.white);
        initPlayer();
        loadBackgroundImage();
        loadPlayerImage();
        setFocusable(true);
        addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                switch(e.getKeyCode()){
                    case java.awt.event.KeyEvent.VK_W, KeyEvent.VK_UP -> keys[0] = true;
                    case java.awt.event.KeyEvent.VK_S, KeyEvent.VK_DOWN -> keys[1] = true;
                    case java.awt.event.KeyEvent.VK_A, KeyEvent.VK_LEFT -> keys[2] = true;
                    case java.awt.event.KeyEvent.VK_D, KeyEvent.VK_RIGHT -> keys[3] = true;
                    case KeyEvent.VK_SHIFT ->  keys[4] = true;
                }
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                switch(e.getKeyCode()){
                    case java.awt.event.KeyEvent.VK_W,KeyEvent.VK_UP -> keys[0] = false;
                    case java.awt.event.KeyEvent.VK_S, KeyEvent.VK_DOWN -> keys[1] = false;
                    case java.awt.event.KeyEvent.VK_A, KeyEvent.VK_LEFT -> keys[2] = false;
                    case java.awt.event.KeyEvent.VK_D, KeyEvent.VK_RIGHT -> keys[3] = false;
                    case KeyEvent.VK_SHIFT ->  keys[4] = false;
                }
            }
        });
        new Timer(16, (ActionEvent e)-> {
            this.repaint();
            this.update();
        }).start();

    }
    void handleInput(){
        if (keys[4]) {
            player.setMovable(runMovement);
        } else {
            player.setMovable(walkMovement);
        }
        float speed = this.player.getMovable().getSpeed();
        float dx = 0;
        float dy = 0;
        if(keys[0]) dy = -speed;
        if(keys[1]) dy = speed;
        if(keys[2]) dx = -speed;
        if(keys[3]) dx = speed;
        player.setDirection(new Position(dx,dy));
    }
    void update(){
        this.handleInput();
        this.player.update();
    }
    void loadPlayerImage(){
        try{
            playerImage = ImageIO.read(getClass().getResource("/res/sprites/mogging_barbarian.png"));
        }catch(IOException e){
            System.err.println("Failed to load player.png");
        }
    }
    void loadBackgroundImage(){
        try{
            backgroundImage = ImageIO.read(getClass().getResource("/res/sprites/grass_tile.png"));
        }catch(IOException e){
            System.err.println("Failed to load background.png");
        }
    }
    void initPlayer(){
        Movable movable = new WalkMovement();
        this.player = new Actor(new Entity("zelda",100,new Position(10f,10f),true), null,movable,null);
        this.player.setState(new MoveState());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(backgroundImage != null){
            for(int x = 0; x < getWidth(); x+=500){
                for(int y = 0; y < getHeight(); y+= 500){
                    g.drawImage(backgroundImage, x, y,500,500, this);
                }
            }
        }
        if(playerImage != null){

            g.drawImage(playerImage, (int)player.getEntity().getPosition().getX(), (int)player.getEntity().getPosition().getY(),200,300, this);
        }else{
        g.setColor(Color.red);
        g.fillRect((int)player.getEntity().getPosition().getX(),(int)player.getEntity().getPosition().getY(),100,100);
        }
    }
}
