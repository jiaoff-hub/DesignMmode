package com.adapter.Adapter_demo;

/**
 * @author 404
 * @version 1.0
 * @description: TODO
 * @date 2021/8/3 10:28
 */
//组合的方式进行适配
public class Adapter2 implements NetToUsb{
    private  Adaprter adaprter=new Adaprter();

    public Adapter2 (Adaprter adaprter) {
        this.adaprter = adaprter;

    }

    @Override
    public void handleRequest() {
        adaprter.request();
    }
}
