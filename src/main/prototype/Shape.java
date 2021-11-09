package main.prototype;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    public Shape() {

    }

    public Shape(Shape shape) {
        this.x = shape.getX();
        this.y = shape.getY();
        this.color = shape.getColor();
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();
}
