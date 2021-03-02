package com.nh.charp01.course;

/**
 * com.nh.charp01.course
 * create by admin nihui
 * create time 2021/3/2
 * version 1.0
 **/
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
