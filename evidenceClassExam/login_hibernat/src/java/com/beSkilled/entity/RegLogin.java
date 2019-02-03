
package com.beSkilled.entity;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@ManagedBean
@SessionScoped
@Entity
@Table
public class RegLogin  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String user_name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean checkuser(){
        
        try {
            
            SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            Query query=session.createQuery("from RegLogin where user_name=:user_name and password=:password");
            query.setString("user_name", user_name);
            query.setString("password", password);
            List list=query.list();
            if (list.size()==1) {
                return true;
                
            }else{
            return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    
    
    }
}
