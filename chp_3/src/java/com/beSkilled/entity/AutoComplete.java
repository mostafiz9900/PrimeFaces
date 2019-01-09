/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.entity;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author User
 */
@ManagedBean
public class AutoComplete {

    public List<String> completeText(String query) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(query + i);

        }
        return result;

    }
    public void save(){
        System.out.println("");
    }
}
