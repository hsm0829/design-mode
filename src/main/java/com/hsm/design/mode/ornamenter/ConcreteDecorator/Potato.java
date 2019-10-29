package com.hsm.design.mode.ornamenter.ConcreteDecorator;

import com.hsm.design.mode.ornamenter.Component.Food;
import com.hsm.design.mode.ornamenter.Decorator.FootDecorator;

public class Potato extends FootDecorator {

    Food food=null;

    public Potato(Food food) {
        this.food = food;
    }

    public String getFoodMenu() {
        return food.getFoodMenu()+" + "+"土豆";
    }

    public double cost() {
        return food.cost()+2d;
    }
}
