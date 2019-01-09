/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.password;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
public class PasswordInput {
    private String pass;
    private String password1;   
    private String password2;  
    private String password3;  
    private String password4; 
public void save(){
    System.out.println("Password : "+ pass);
}
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getPassword3() {
        return password3;
    }

    public void setPassword3(String password3) {
        this.password3 = password3;
    }

    public String getPassword4() {
        return password4;
    }

    public void setPassword4(String password4) {
        this.password4 = password4;
    }
    
}
