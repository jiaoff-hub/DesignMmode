package com.factory.factorymethod;

/**
 * @author 404
 * @version 1.0
 * @description: TODO
 * @date 2021/7/30 15:50
 */
public class WulingFactory implements Factory{
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
