/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.autoComplete;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
public class Completed {

    private String text;
    private List<String> selectTexts;
    
    public List<String> completeText(String query) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            result.add(query + i);
        }
        return result;
    }
    
    public void save(){
        System.out.println("Text :" +text );
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public List<String> getSelectTexts() {
        return selectTexts;
    }

    public void setSelectTexts(List<String> selectTexts) {
        this.selectTexts = selectTexts;
    }
    
}
