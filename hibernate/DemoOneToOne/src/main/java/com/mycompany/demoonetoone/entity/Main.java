
package com.mycompany.demoonetoone.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aditi
 */
public class Main {
    
    public static void main(String[] args) {

    Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Education.class).addAnnotatedClass(Address.class);
      org.hibernate.SessionFactory sf = con.buildSessionFactory();    
      Session session = sf.openSession();  
      Transaction tx = session.beginTransaction();
      Address add=new Address("tulsi nagar", "Tekri", "Udaipur", "Rajasthan", "", "India");
      Education edu=new Education( "Under graduation", "B.Tech", "2019", "R.M.V.");   
       Student stu=new Student("Aditi", "", "Nagda", "Ms.", "", "nagdaaditi123@gmail.com", "999999999",add,edu);
      session.save(stu);     
      tx.commit();


    }
    
}
