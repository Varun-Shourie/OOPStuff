package academy.learnprogramming;

public class Point {
    private int x;
    private int y;

    public Point() {

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y - this.y));
    }

    public double distance(Point point) {
        return(Math.sqrt((point.getX() - this.x)*(point.getX() - this.x) +
                (point.getY() - this.y)*(point.getY() - this.y)));
    }

}
