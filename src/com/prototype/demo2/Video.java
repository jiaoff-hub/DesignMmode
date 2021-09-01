package com.prototype.demo2;

import java.util.Date;

/**
 * @author 404
 * @version 1.0
 * 1、实现一个接口  Cloneable
 * 2、重写一个方法  clone()
 * @date 2021/8/1 10:42
 */
public class Video implements  Cloneable{
    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Video v = (Video) object;
        v.createTime=(Date) this.createTime.clone();
        return  v;
    }

    public Video() {
    }
    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
