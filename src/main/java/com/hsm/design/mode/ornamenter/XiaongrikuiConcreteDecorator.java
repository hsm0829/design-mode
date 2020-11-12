/**
 * projectName: design-mode
 * fileName: Houzi.java
 * packageName: com.hsm.design.mode.ornamenter
 * date: 2020-11-12 14:53
 * copyright(c) 2017-2020 xxx公司
 */
package com.hsm.design.mode.ornamenter;

/**
 * @version: V1.0
 * @author: Huangshumei
 * @className: Houzi
 * @packageName: com.hsm.design.mode.ornamenter
 * @description: 向日葵
 * @data: 2020-11-12 14:53
 **/
public class XiaongrikuiConcreteDecorator extends Decorator {

    Component component=null;

    public XiaongrikuiConcreteDecorator(Component component) {
        this.component = component;
    }

    public String getRoleName() {
        return component.getRoleName()+" + 向日葵";
    }
}