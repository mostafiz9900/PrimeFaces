package com.packt.pfblueprints.dao;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class LoginDAO {

	private SessionFactory sessionFactory;

	private SessionFactory configureSessionFactory() throws HibernateException {
		Configuration configuration = new Configuration();
		configuration.configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionfactory = configuration
				.buildSessionFactory(builder.build());
		return sessionfactory;
	}

	public LoginDAO() throws SQLException {
		super();
	}

	public boolean validateUser(String userid, String password, String userrole) {
		try {
			sessionFactory = configureSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			String query = null;
			if (userrole.equalsIgnoreCase("S") && userid.equalsIgnoreCase("servicecenter")
					&& password.equalsIgnoreCase("servicecenter")) {
				return true;
			}
			else if (userrole.equalsIgnoreCase("I") && userid.equalsIgnoreCase("investor")
					&& password.equalsIgnoreCase("investor")) {
				return true;
			}
			else if (userrole.equalsIgnoreCase("D")) {
				query = "from Advisor where dealernumber='" + userid + "' and dealernumber='" + password + "' ";
			}
			else if (userrole.equalsIgnoreCase("A")) {
				query = "from Representative where advisornumber='" + userid + "' and advisornumber='" + password + "' ";
			}
			else {
				return false;
			}
			Query queryObj = session.createQuery(query);
			List<Object> list = queryObj.list();
			int count = 0;
			if (list != null) {
				count = list.size();
			}
			session.getTransaction().commit();
			if (count > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}
