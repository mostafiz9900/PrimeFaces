package com.packt.pfblueprints.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.primefaces.event.ReorderEvent;

import com.packt.pfblueprints.dao.ServiceCenterDAO;
import com.packt.pfblueprints.model.Dealer;

@ManagedBean
@ViewScoped
public class ServiceCenterController implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<Dealer> servicecenterInfo=new ArrayList<Dealer>();
	private Dealer dealerobj=new Dealer();
	ServiceCenterDAO dao = new ServiceCenterDAO();
	private int advisorsCount=0;
	
	@PostConstruct
	public void init() { 
		
		servicecenterInfo=dao.getAllDealers();
		advisorsCountCalc();
	}
	
	public void deleteDealer(){
		servicecenterInfo=dao.deleteDealer(dealerobj);
	}
	
	public void advisorsCountCalc(){
		
		for(Dealer obj:servicecenterInfo){
			advisorsCount+=new Integer(obj.getNoofadvisors());
		}
	}
	
	public String storeSelectedDealer(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("dealertinnumber", dealerobj.getDealertinnumber());
		return "dealerinfo.xhtml?faces-redirect=true";
	}
	
	public void updateDealerProfile(){
		dao.updateDealerProfile(dealerobj);
	}
	
	
	public void onRowReorder(ReorderEvent event){
		 FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Row Moved", "From: " + event.getFromIndex() + ", To:" + event.getToIndex());
         FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Dealer getDealerobj() {
		return dealerobj;
	}

	public void setDealerobj(Dealer dealerobj) {
		this.dealerobj = dealerobj;
	}

	public List<Dealer> getServicecenterInfo() {
		return servicecenterInfo;
	}

	public void setServicecenterInfo(List<Dealer> servicecenterInfo) {
		this.servicecenterInfo = servicecenterInfo;
	}

	public int getAdvisorsCount() {
		return advisorsCount;
	}

	public void setAdvisorsCount(int advisorsCount) {
		this.advisorsCount = advisorsCount;
	}
	
}
