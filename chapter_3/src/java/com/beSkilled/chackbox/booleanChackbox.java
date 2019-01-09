/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.chackbox;

import java.lang.reflect.Array;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.apache.catalina.tribes.util.Arrays;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
public class booleanChackbox {
    private boolean selectValue;
    private List<String> selectCourse;

    public boolean isSelectValue() {
        return selectValue;
    }

    public void setSelectValue(boolean selectValue) {
        this.selectValue = selectValue;
    }

    public List<String> getSelectCourse() {
        return selectCourse;
    }

    public void setSelectCourse(List<String> selectCourse) {
        this.selectCourse = selectCourse;
    }
    
    public void save(){
        System.out.println("Select Value"+selectValue);
    }
    public void saveMultiple(){
        System.out.println(Arrays.toString(selectCourse.toArray()));
    }
    
}
