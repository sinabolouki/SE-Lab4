package test;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void coffeeShopTest() {
        Restaurant coffeeShop = new CoffeeShop();
        Assert.assertEquals(coffeeShop.getFood().getString(), "Pasta");
        Assert.assertEquals(coffeeShop.getDrink().getString(), "Coffee");
    }

    @Test
    public void fastFoodTest() {
        Restaurant fastFood = new FastFood();
        Assert.assertEquals(fastFood.getFood().getString(), "Pizza");
        Assert.assertEquals(fastFood.getDrink().getString(), "Pepsi");
    }
}
