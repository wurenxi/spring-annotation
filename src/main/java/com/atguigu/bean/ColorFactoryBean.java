package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @description:创建一个Spring定义的FactoryBean
 * @author: gxl
 * @createDate: 2021/8/24 18:33
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    //返回Color对象，这个对象会添加到容器中
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    //是单例？
    //true：是单例，在容器中保存一份；false：是多实例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
