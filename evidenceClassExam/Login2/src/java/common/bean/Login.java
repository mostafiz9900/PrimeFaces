/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.bean;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Mostafizur
 */
@ManagedBean(name = "login_bean")
@SessionScoped
@Entity
public class Login implements Serializable {

    @Id
    private int id;
    private String user_name;
    private String password;

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
//        if (user_name.equals("mosta")&& password.equals("pass")) {
//            return true;
//        }else{
//        return false;
//        }
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Login where user_name=:user_name and password=:password");
        query.setString("user_name", user_name);
        query.setString("password", password);

        List list = query.list();

        if (list.size() == 1) {
            return true;

        } else {
            return false;
        }

    }
}
