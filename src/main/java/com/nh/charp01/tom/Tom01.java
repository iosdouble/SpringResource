package com.nh.charp01.tom;

/**
 * com.nh.charp01.tom
 * create by admin nihui
 * create time 2021/3/2
 * version 1.0
 **/
public class Tom01 {
    private ICourse course;

    public Tom01(ICourse course){
        this.course = course;
    }

    public void study(){
        course.study();
    }
}
