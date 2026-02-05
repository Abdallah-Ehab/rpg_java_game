package gameworld;

import entities.Enemy;
import entities.Entity;
import entities.Player;
import vector.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameWorld {
    Scanner scanner = new Scanner(System.in);
    private final List<Character> characters = new ArrayList<>(
            List.of(
                    new Player(new Entity("link",100,new Position(),true)),
                    new Enemy(new Entity("golliath",100,new Position(10f,29f),true))

            ));


    public void tick(){

        for(var entity : characters){
            entity.update();
            }
        }
    }




