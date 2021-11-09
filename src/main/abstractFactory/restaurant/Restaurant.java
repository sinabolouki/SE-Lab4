package main.abstractFactory.restaurant;

import main.abstractFactory.drink.Drink;
import main.abstractFactory.food.Food;

public abstract class Restaurant {

    public abstract Food getFood();
    public abstract Drink getDrink();
}
