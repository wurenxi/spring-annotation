package com.atguigu.bean;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/24 14:50
 */
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
