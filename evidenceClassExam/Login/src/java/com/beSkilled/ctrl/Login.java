/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.ctrl;

import com.beSkilled.utile.HibernateUtil;
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
import org.hibernate.Transaction;

/**
 *
 * @author Mostafizur
 */
@ManagedBean(name = "login_bean")
@SessionScoped
@Entity
@Table
public class Login implements Serializable{

    

   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String user_name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean checkuser() {
        try {
             SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Query query = session.createQuery("from Login where user_name=:user_name and password=:password");
        query.setString("user_name", user_name);
        query.setString("password", password);

        List list = query.list();
        System.out.println("List Size" + list.size());
        if (list.size() == 1) {
            return true;

        } else {
            return false;
        }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }
}
