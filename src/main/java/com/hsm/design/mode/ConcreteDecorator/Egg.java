package com.hsm.design.mode.ConcreteDecorator;

import com.hsm.design.mode.Component.Food;
import com.hsm.design.mode.Decorator.FootDecorator;

public class Egg extends FootDecorator {

    Food food=null;

    public Egg(Food food) {
        this.food = food;
    }

    public String getFoodMenu() {
        return food.getFoodMenu()+" + "+"鸡蛋";
    }

    public double cost() {
        return food.cost()+2d;
    }
}
