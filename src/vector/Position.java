package vector;

public class Position {
    private final float x;
    private final float y;
    public Position(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Position() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public Position add(Position other){
        return new Position(this.x + other.x, this.y + other.y);
    }
    @Override
    public String toString(){
        return "Position{x=" + x + ", y=" + y + "}";
    }
}
