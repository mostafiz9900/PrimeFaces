/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.service;

import com.beSkilled.entity.Student;
import com.beSkilled.utile.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class StudentService {

    public static void saveOrEdit(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(student);
        System.out.println("Insert data success");
        tr.commit();
        session.close();
    }

    public static void delete(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(student);
        System.out.println("Delete data success");
        tr.commit();
        session.close();
    }

    public static List<Student> getStudentList() {
        List<Student> student = new ArrayList<>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction tr = session.beginTransaction();
            session.saveOrUpdate(student);
            student=session.createQuery("FROM Student").list();
            tr.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }
}
