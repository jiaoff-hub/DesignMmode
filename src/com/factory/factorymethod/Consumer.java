package com.factory.factorymethod;

import com.factory.simplefactory.Factory;

/**
 * @author 404
 * @version 1.0
 * @description: TODO
 * @date 2021/7/30 15:29
 */
public class Consumer {
    public static void main(String[] args) {
        Car car1=new WulingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
        car1.getcar();
        car2.getcar();
    }
}
