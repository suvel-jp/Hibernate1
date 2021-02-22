package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.Product;

public class SaveProducts {

	public static void main(String[] args) {
		
	
		Configuration cfg=null;
		Session ses= null;
		SessionFactory factory=null;
		Transaction tx=null;
		
		cfg= new Configuration();
		
		cfg=cfg.configure("cfg/hibernate.cfg.xml");
		
		factory =cfg.buildSessionFactory();
		
		ses= factory.openSession();
		
		Product p1 = new Product();
		
		p1.setProductId(2);
		p1.setProductName("Mobile");
		p1.setProductPrice(14000.50);
		
		tx=ses.beginTransaction();
		
		ses.save(p1);
		
		tx.commit();
		
		
		System.out.println("Record Inserted SuccessFully....MF...;)");
		
		
	}
	
}
