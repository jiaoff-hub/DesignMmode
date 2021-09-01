package com.adapter.Adapter_demo;

/**
 * @author 404
 * @version 1.0
 * @description: TODO
 * @date 2021/8/3 9:47
 */
public interface NetToUsb {  //转换器的接口，抽象实现，可以实现不同的转换器
    /**
     * @description:处理请求，网线=》usb
     * @author JFZ
     * @date 2021/8/3 9:48
     * @version 1.0
     */
    public void handleRequest();
}
