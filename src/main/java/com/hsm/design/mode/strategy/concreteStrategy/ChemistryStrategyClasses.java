package com.hsm.design.mode.strategy.concreteStrategy;

import com.hsm.design.mode.strategy.strategy.IStrategyClasses;

/**
 * 化学课
 */
public class ChemistryStrategyClasses implements IStrategyClasses {

    public void operate() {
        System.out.println("今天小明去补课了，补的是：化学课");
    }
}
