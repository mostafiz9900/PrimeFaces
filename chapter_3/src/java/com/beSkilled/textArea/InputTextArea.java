/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.textArea;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
public class InputTextArea {
    private String msg;
    
    public void save(){
        System.out.println("Message : "+ msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
}
