package com.hsm.design.mode.ornamenter.ConcreteComponent;

import com.hsm.design.mode.ornamenter.Component.Food;

/**
 * 被装饰的对象：黄焖鸡米饭
 */
public class Rice extends Food {

    public Rice() {
        this.foodMenu="黄焖鸡米饭";
    }
    /**
     * 黄焖鸡米饭 价格
     * @return
     */
    public double cost() {
        return 16d;
    }
}
