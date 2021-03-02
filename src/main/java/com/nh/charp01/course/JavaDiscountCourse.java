package com.nh.charp01.course;

/**
 * com.nh.charp01.course
 * create by admin nihui
 * create time 2021/3/2
 * version 1.0
 **/
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    public Double getPrice(){
        return super.getPrice()*0.61;
    }
}
