/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.inputmask;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
public class InputMask {
    private String Date;
    private String phoneNumber;
    private String texId;
    private String prodectKey;
    
    public void save(){
        System.out.println("Date"+Date);
        System.out.println("phoneNumber"+phoneNumber);
        System.out.println("texId"+texId);
        System.out.println("prodectKey"+prodectKey);
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTexId() {
        return texId;
    }

    public void setTexId(String texId) {
        this.texId = texId;
    }

    public String getProdectKey() {
        return prodectKey;
    }

    public void setProdectKey(String prodectKey) {
        this.prodectKey = prodectKey;
    }
    
    
}
