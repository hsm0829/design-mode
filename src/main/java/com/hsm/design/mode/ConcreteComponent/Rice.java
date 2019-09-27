package com.hsm.design.mode.ConcreteComponent;

import com.hsm.design.mode.Component.Food;

/**
 * 被装饰的对象：黄焖鸡米饭
 */
public class Rice extends Food {

    public Rice() {
    }
    /**
     * 黄焖鸡米饭 价格
     * @return
     */
    public double cost() {
        return 16d;
    }
}
