package com.prototype.demo2;

import java.util.Date;

/**
 * @author 404
 * @version 1.0
 * 克隆视频
 * @date 2021/8/1 10:48
 */
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException{
        //原型对象 V1
        Date date = new Date();
        Video video1 = new Video("Java",date);
        System.out.println("V1"+video1);
        System.out.println("v1=>hash"+video1.hashCode());
        //V1克隆出V2,浅克隆，date只拷贝了指针
        //深克隆：序列化与反序列化    修改clone方法
        Video  video2= (Video) video1.clone();
        System.out.println("V2"+video2);
        System.out.println("v2=>hash"+video2.hashCode());
        date.setTime(883333333);
        System.out.println("V1"+video1);
        System.out.println("V2"+video2);








    }
}
