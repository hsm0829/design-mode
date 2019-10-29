package com.hsm.design.mode.strategy.app;

import com.hsm.design.mode.strategy.concreteStrategy.ChemistryStrategyClasses;
import com.hsm.design.mode.strategy.concreteStrategy.EnglishStrategyClasses;
import com.hsm.design.mode.strategy.concreteStrategy.HistoryStrategyClasses;
import com.hsm.design.mode.strategy.context.StrategyContext;

public class App {
    public static void main(String[] args){
        //第一次，小明上了历史课
        StrategyContext context=new StrategyContext(new HistoryStrategyClasses());
        context.takeClasses();

        //第二次，小明上了英语课
        context=new StrategyContext(new EnglishStrategyClasses());
        context.takeClasses();

        //第三次，小明上了化学课
        context=new StrategyContext(new ChemistryStrategyClasses());
        context.takeClasses();
    }


}
