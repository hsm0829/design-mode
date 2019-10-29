package com.hsm.design.mode.ornamenter.Component;

/**
 * 核心抽象类 Component
 */
public abstract class Food {

    //菜单
    public String foodMenu;

    public String getFoodMenu() {
        return this.foodMenu;
    }
    //结果价格
    public abstract double cost();
}
