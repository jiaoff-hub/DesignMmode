package com.adapter.Adapter_demo;

/**
 * @author 404
 * @version 1.0
 * @description: TODO
 * @date 2021/8/3 9:50
 */
//真正的适配器，需要连接网线和USB实现上网
    //采用了继承的方式，类适配器。
// //组合 对象适配器
public class Adapters extends Adaprter  implements NetToUsb{
    @Override
    public void handleRequest() {
        super.request();//可以上网了

    }
}
