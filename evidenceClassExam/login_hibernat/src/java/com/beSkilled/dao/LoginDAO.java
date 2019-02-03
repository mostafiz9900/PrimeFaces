/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.dao;

import com.beSkilled.entity.RegLogin;
import com.beSkilled.utile.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Mostafizur
 */
public class LoginDAO {
    public static void saveOrUpdate(RegLogin regLogin){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.save(regLogin);
        System.out.println("insert success");
        tr.commit();
    }
    
    public static void deleteLog(RegLogin regLogin){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.delete(regLogin);
        System.out.println("Delete success");
        tr.commit();
    }
    
    
}
