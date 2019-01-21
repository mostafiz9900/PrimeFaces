/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.service;

import com.beSkilled.entity.Student;
import com.beSkilled.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Mostafizur
 */
public class StudentService {
    public static void saveStudent(Student s){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.save(s);
        System.out.println("insert success");
        tr.commit();
    }
    
    public static void updateStudent(Student s){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.saveOrUpdate(s);
        System.out.println("update success");
        tr.commit();
    }
     public static void deleteStudent(Student s){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.delete(s);
        System.out.println("delete success");
        tr.commit();
    }
    
}
