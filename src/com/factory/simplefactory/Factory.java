package com.factory.simplefactory;

/**
 * @author 404
 * @version 1.0
 * @description: TODO
 * @date 2021/7/30 15:28
 */
public class Factory {
    public static Car getcar(String car){
        if(car.equals("Wuling")){
            return new Wuling();
        }
        else if (car.equals("Tesla")){
            return new Tesla();
        }
        else{
            return  null;
        }
    }
}
