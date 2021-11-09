package main.prototype;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle() {

    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
