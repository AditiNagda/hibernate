
package com.mycompany.hibernateproject;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aditi
 */
public class Main {
    public static void main(String[] args) {
        
        Configuration con = new Configuration().configure().addAnnotatedClass(UserProfile.class);
       org.hibernate.SessionFactory sf = con.buildSessionFactory();
       
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
      // UserProfile hm=new UserProfile(1,"aditi","nagdaaditi123@gmail.com","999999999");
       UserProfile hm2=new UserProfile("aditi","nagdaaditi123@gmail.com","997990099");
      // session.save(hm);
       session.save(hm2);
       tx.commit();
    }
    
}
