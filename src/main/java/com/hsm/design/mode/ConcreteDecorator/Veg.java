package com.hsm.design.mode.ConcreteDecorator;

import com.hsm.design.mode.Component.Food;
import com.hsm.design.mode.Decorator.FootDecorator;

public class Veg extends FootDecorator {
    Food food=null;

    public Veg(Food food) {
        this.food = food;
    }

    public String getFoodMenu() {
        return food.getFoodMenu()+" + "+"蔬菜";
    }

    public double cost() {
        return food.cost()+1.5d;
    }
}
