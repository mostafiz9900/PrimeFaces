/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.spinner;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
public class SpinnerController {

    private String age;

    private double price;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void save() {
        System.out.println("Age : " + age);
        System.out.println("Price : " + price);
    }

}
