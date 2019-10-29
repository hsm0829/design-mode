package com.hsm.design.mode.ornamenter.Decorator;

import com.hsm.design.mode.ornamenter.Component.Food;

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
