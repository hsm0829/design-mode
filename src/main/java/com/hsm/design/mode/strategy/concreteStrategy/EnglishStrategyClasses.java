package com.hsm.design.mode.strategy.concreteStrategy;

import com.hsm.design.mode.strategy.strategy.IStrategyClasses;

/**
 * 英语课
 */
public class EnglishStrategyClasses implements IStrategyClasses {

    public void operate() {
        System.out.println("今天小明去补课了，补的课是：英语课");
    }
}
