/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author User
 */
@ManagedBean
@ViewScoped
public class InputMarkcBean {

    private String mobaileNo;

    public String getMobaileNo() {
        return mobaileNo;
    }

    public void setMobaileNo(String mobaileNo) {
        this.mobaileNo = mobaileNo;
    }

    public void save() {
        System.out.println("MobailNumbe" + mobaileNo);
    }
}
