package com.packt.pfblueprints.controller;

import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ViewScoped
public class LoginController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	public LoginController() {
		super();
	}

	public String validateUser() throws SQLException {
		FacesMessage msg = null;
		boolean isValidUser = false;
		if (username.equalsIgnoreCase("healthcare")
				&& password.equalsIgnoreCase("healthcare")) {
			return "/views/healthkart?faces-redirect=true";
		}
		else if (username.equalsIgnoreCase("admin")
				&& password.equalsIgnoreCase("admin")) {
			return "/views/admin?faces-redirect=true";
		}
		else {
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error",
					"Invalid credentials");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return null;
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}