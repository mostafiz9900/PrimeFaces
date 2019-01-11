/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.pickList;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.DualListModel;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
public class PickListController {
    private String countres;
    private List<String> countiesSource=new ArrayList<String>();
    private List<String> countiesTarget=new ArrayList<String>();

    public PickListController(String countres) {
        this.countres = countres;
        countiesSource.add("England");
        countiesSource.add("Germany");
        countiesSource.add("Switzerland");
        countiesSource.add("Bangladesh");
    }
    private DualListModel<String> countries=new DualListModel<String>(countiesSource, countiesTarget);

    public DualListModel<String> getCountries() {
        return countries;
    }

    public void setCountries(DualListModel<String> countries) {
        this.countries = countries;
    }
    
    
   
    public String getCountres() {
        return countres;
    }

    public void setCountres(String countres) {
        this.countres = countres;
    }

    public List<String> getCountiesSource() {
        return countiesSource;
    }

    public void setCountiesSource(List<String> countiesSource) {
        this.countiesSource = countiesSource;
    }

    public List<String> getCountiesTarget() {
        return countiesTarget;
    }

    public void setCountiesTarget(List<String> countiesTarget) {
        this.countiesTarget = countiesTarget;
    }
    
   public void save(){
   
   }
}
