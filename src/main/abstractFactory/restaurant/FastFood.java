package main.abstractFactory.restaurant;

import main.abstractFactory.drink.Drink;
import main.abstractFactory.drink.Pepsi;
import main.abstractFactory.food.Food;
import main.abstractFactory.food.Pizza;

public class FastFood extends Restaurant{

    @Override
    public Food getFood() {
        return new Pizza();
    }

    @Override
    public Drink getDrink() {
        return new Pepsi();
    }
}
