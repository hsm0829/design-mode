package com.hsm.design.mode.strategy.context;

import com.hsm.design.mode.strategy.strategy.IStrategyClasses;

/**
 * 环境类
 */
public class StrategyContext {

    private IStrategyClasses strategyClasses;

    public StrategyContext(IStrategyClasses strategyClasses) {
        this.strategyClasses = strategyClasses;
    }

    public void takeClasses(){
        strategyClasses.operate();
    }
}
