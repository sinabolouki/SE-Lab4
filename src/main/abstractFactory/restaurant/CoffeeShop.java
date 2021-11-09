package main.abstractFactory.restaurant;

import main.abstractFactory.drink.Coffee;
import main.abstractFactory.drink.Drink;
import main.abstractFactory.food.Food;
import main.abstractFactory.food.Pasta;

public class CoffeeShop extends Restaurant{


    @Override
    public Food getFood() {
        return new Pasta();
    }

    @Override
    public Drink getDrink() {
        return new Coffee();
    }
}
