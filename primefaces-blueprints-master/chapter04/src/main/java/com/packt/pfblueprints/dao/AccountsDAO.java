package com.packt.pfblueprints.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.packt.pfblueprints.model.AccountSummary;
import com.packt.pfblueprints.model.Dealer;

public class AccountsDAO {

	private  SessionFactory sessionFactory;

	private  SessionFactory configureSessionFactory()
			throws HibernateException {
		Configuration configuration = new Configuration();
		configuration.configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionfactory = configuration
				.buildSessionFactory(builder.build());
		return sessionfactory;
	}

	public AccountsDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<AccountSummary> getAllAccounts(int first,int pageSize,String sortField,String sortOrder,Map<String,Object> filters) {
		sessionFactory = configureSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String investorname=null;
		String accountnumber=null;
		for(Iterator<String> it = filters.keySet().iterator(); it.hasNext();) {
                String filterProperty = it.next();
                if(filterProperty.equalsIgnoreCase("investorName")){
                 investorname = (String)filters.get(filterProperty);
                }
                if(filterProperty.equalsIgnoreCase("accountNumber")){
                 accountnumber = (String)filters.get(filterProperty);
                }
		}
		String query=null;
		int end=0;
		if(sortOrder.equalsIgnoreCase("default")){
			end=20;
			sortOrder="ASC";
		}
		if(filters.isEmpty() ){
			end=first+pageSize;}
		else{
			end=20;
		}
		
		
		if(investorname!=null && accountnumber!=null){
		    query="from AccountSummary WHERE (id BETWEEN "+(first+1)+" AND "+end+") AND ((investorName="+investorname+") AND (accountNumber="+accountnumber+")) ORDER BY "+sortField+" "+sortOrder;
		} else if(investorname!=null) {
		    query="from AccountSummary WHERE (id BETWEEN "+(first+1)+" AND "+end+") AND (investorName="+investorname+") ORDER BY "+sortField+" "+sortOrder;	
		} else if(accountnumber!=null) {
		    query="from AccountSummary WHERE (id BETWEEN "+(first+1)+" AND "+end+") AND (accountNumber="+accountnumber+") ORDER BY "+sortField+" "+sortOrder;
		} else{
			query="from AccountSummary WHERE (id BETWEEN "+(first+1)+" AND "+end+") ORDER BY "+sortField+" "+sortOrder;
		}
		Query queryResult = session.createQuery(query);
		List<AccountSummary> allAccounts = queryResult.list();
		session.getTransaction().commit();
		return allAccounts;

	}

}
