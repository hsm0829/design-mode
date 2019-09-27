package com.hsm.design.mode.Component;

/**
 * 核心抽象类 Component
 */
public abstract class Food {

    String foodMenu="菜单";

    public String getFoodMenu() {
        return this.foodMenu;
    }
    //结果价格
    public abstract double cost();
}
