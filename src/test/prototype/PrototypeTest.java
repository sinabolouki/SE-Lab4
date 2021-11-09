package prototype;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void rectangleTest() {
        Rectangle rectangle = new Rectangle();
        rectangle.setX(10);
        rectangle.setY(20);
        rectangle.setColor("blue");
        rectangle.setWidth(40);
        rectangle.setHeight(50);

        Rectangle newRectangle = rectangle.clone();
        Assert.assertEquals(newRectangle.getX(), rectangle.getX());
        Assert.assertEquals(newRectangle.getY(), rectangle.getY());
        Assert.assertEquals(newRectangle.getColor(), rectangle.getColor());
        Assert.assertEquals(newRectangle.getWidth(), rectangle.getwidth());
        Assert.assertEquals(newRectangle.getHeight(), rectangle.getHeight());
    }

    @Test
    public void circleTest() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setColor("blue");
        circle.setRadius(35);

        Circle newCircle = circle.clone();
        Assert.assertEquals(newCircle.getX(), circle.getX());
        Assert.assertEquals(newCircle.getY(), circle.getY());
        Assert.assertEquals(newCircle.getColor(), circle.getColor());
        Assert.assertEquals(newCircle.getRadius(), circle.getRadius());
    }
}
