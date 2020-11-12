/**
 * projectName: design-mode
 * fileName: App.java
 * packageName: com.hsm.design.mode.ornamenter
 * date: 2020-11-12 15:43
 * copyright(c) 2017-2020 xxx公司
 */
package com.hsm.design.mode.ornamenter;

/**
 * @version: V1.0
 * @author: Huangshumei
 * @className: App
 * @packageName: com.hsm.design.mode.ornamenter
 * @description: 装饰者模式
 * @data: 2020-11-12 15:43
 **/
public class App {

    public static void main(String[] args){

        HouziConcreteComponent houzi=new HouziConcreteComponent();

        XiaongrikuiConcreteDecorator xiaongrikui=new XiaongrikuiConcreteDecorator(houzi);

        SimiaoConcreteDecorator simiao=new SimiaoConcreteDecorator(xiaongrikui);

        System.out.println("孙悟空变成了："+simiao.getRoleName());


    }
}