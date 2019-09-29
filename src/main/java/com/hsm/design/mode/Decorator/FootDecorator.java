package com.hsm.design.mode.Decorator;

import com.hsm.design.mode.Component.Food;

/**
 * 装饰者抽象类
 */
public abstract class FootDecorator extends Food {

    /**
     * 获取菜单
     * @return
     */
    public abstract String getFoodMenu();
}
