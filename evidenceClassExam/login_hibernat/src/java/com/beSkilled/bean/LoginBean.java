
package com.beSkilled.bean;

import com.beSkilled.dao.LoginDAO;
import com.beSkilled.entity.RegLogin;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LoginBean {
    private LoginDAO loginDAO=new LoginDAO();
    private RegLogin regLogin;
    
    public void save(){
    loginDAO.saveOrUpdate(regLogin);
    }
     public void delete(){
    loginDAO.deleteLog(regLogin);
    }
     public void reset(){
     regLogin=new RegLogin();
     }
    
    

    public LoginDAO getLoginDAO() {
        return loginDAO;
    }

    public void setLoginDAO(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    public RegLogin getRegLogin() {
        if (regLogin==null) {
            regLogin=new RegLogin();
            
        }
        return regLogin;
    }

    public void setRegLogin(RegLogin regLogin) {
        this.regLogin = regLogin;
    }
    
}
