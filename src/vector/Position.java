package vector;

public class Position {
    private final double x;
    private final double y;
    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    @Override
    public String toString(){
        return "Position{x=" + x + ", y=" + y + "}";
    }
}
