package com.factory.simplefactory;

/**
 * @author 404
 * @version 1.0
 * @description: TODO
 * @date 2021/7/30 15:29
 */
public class Consumer {
    public static void main(String[] args) {
        Car car1=Factory.getcar("Wuling");
        Car car2 = Factory.getcar("Tesla");
        car1.getcar();
        car2.getcar();

    }
}
