package gameworld;

import entities.Actor;
import entities.Entity;
import vector.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameWorld {

    List<Actor> characters = new ArrayList<>(List.of(new Actor(new Entity("link",100,new Position(10f,10f),true), null,null,null)));

    public void tick(){

        for(var character : characters){
            character.update();
            }
        }
    }




