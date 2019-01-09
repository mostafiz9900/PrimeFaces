/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.textEdit;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
public class TextEditing {
    private String text1;
    private String text2;
    
    public void save(){
        System.out.println("text1 : "+text1);
        System.out.println("text2 : "+text2);
    }
    
    

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
    
    
}
