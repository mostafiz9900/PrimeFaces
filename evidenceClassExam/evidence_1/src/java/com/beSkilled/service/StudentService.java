package com.beSkilled.service;

import com.beSkilled.entity.Student;
import com.beSkilled.utile.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentService {

    public static void saveOrEdit(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(student);
        System.out.println("insert success data");
        tr.commit();

    }

    public static void delete(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(student);
        System.out.println("delete success data");
        tr.commit();

    }

    public static List<Student> getList() {
        List<Student> stu = new ArrayList<>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction tr = session.beginTransaction();
            stu = session.createQuery("FROM Student").list();

            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stu;

    }

}
