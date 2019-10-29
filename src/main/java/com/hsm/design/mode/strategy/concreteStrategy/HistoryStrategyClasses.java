package com.hsm.design.mode.strategy.concreteStrategy;

import com.hsm.design.mode.strategy.strategy.IStrategyClasses;

/**
 * 历史课
 */
public class HistoryStrategyClasses implements IStrategyClasses {

    public void operate() {
        System.out.println("今天小明去补课，补的是：历史课");
    }
}
