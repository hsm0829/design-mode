package com.hsm.design.mode.ornamenter.app;

import com.hsm.design.mode.ornamenter.ConcreteComponent.Rice;
import com.hsm.design.mode.ornamenter.ConcreteDecorator.Egg;
import com.hsm.design.mode.ornamenter.ConcreteDecorator.Potato;
import com.hsm.design.mode.ornamenter.ConcreteDecorator.Veg;

public class Test {
    
    public static void main(String[] args){
        Rice rice=new Rice();
        Egg egg=new Egg(rice);
        Potato potato=new Potato(egg);
        Veg veg=new Veg(potato);
        System.out.println(veg.getFoodMenu());
        System.out.println(veg.cost());
    }
}
