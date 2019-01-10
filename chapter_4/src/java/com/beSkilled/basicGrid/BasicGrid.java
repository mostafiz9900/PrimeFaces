/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.basicGrid;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author User
 */
@ManagedBean
public class BasicGrid {

    private String firstName;
    private String lastName;

    public void save() {
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
