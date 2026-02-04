import entities.Character;
import entities.Enemy;
import entities.Entity;
import entities.Player;
import vector.Position;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> entityList = new ArrayList<>();
        entityList.add(new Player(new Entity("link",100,new Position(),true)));
        entityList.add(new Enemy(new Entity("golliath",100,new Position(10f,29f),true)));
        for(var entity : entityList)
        {
            entity.update();
        }
    }
}