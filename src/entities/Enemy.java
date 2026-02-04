package entities;

import vector.Position;

public class Enemy implements Character,NonPlayable,Dynamic{
    private Entity entity;
    private final Dialogue dialogue;

    public Enemy(Entity entity) {
        this.entity = entity;
        this.dialogue = new Dialogue(
                entity.getName(),
                "I am the great mage Golliath"
        );
    }

    private class Dialogue{
        private final String header;
        private final String body;
        public Dialogue(String header, String body){
            this.header = header;
            this.body = body;
        }
    }

    @Override
    public String speak() {
        return dialogue.header + "\n" + dialogue.body;
    }


    @Override
    public void move(){
        Position position = entity.getPosition();
        this.entity.setPosition(new Position(position.getX() + 20, position.getY() + 20));
    }

    @Override
    public void update() {

        this.move();
        System.out.println(this.entity.getPosition());
    }
}
