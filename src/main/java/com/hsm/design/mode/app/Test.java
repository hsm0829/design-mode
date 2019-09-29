package com.hsm.design.mode.app;

import com.hsm.design.mode.ConcreteComponent.Rice;
import com.hsm.design.mode.ConcreteDecorator.Egg;
import com.hsm.design.mode.ConcreteDecorator.Potato;
import com.hsm.design.mode.ConcreteDecorator.Veg;

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
