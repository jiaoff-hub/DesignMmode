package com.factory.factorymethod;

/**
 * @author 404
 * @version 1.0
 * @description: TODO
 * @date 2021/7/30 15:49
 */
public class TeslaFactory implements Factory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
