package com.adapter.Adapter_demo;

/**
 * @author 404
 * @version 1.0
 * @description: TODO
 * @date 2021/8/3 9:46
 */
public class Computer {
    public void net(NetToUsb adapter){
        //无法通过网线，需要转接头
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer(); //电脑
        Adaprter adaprter = new Adaprter();//网线
        //Adapters adapters =new Adapters();//适配器
        Adapter2 adapter2 = new Adapter2(adaprter);

        computer.net(adapter2);


    }
}
