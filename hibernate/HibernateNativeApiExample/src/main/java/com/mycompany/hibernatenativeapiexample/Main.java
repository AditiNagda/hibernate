
package com.mycompany.hibernatenativeapiexample;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aditi
 */
public class Main {
    
    public static void main(String[] args) {
           Configuration con = new Configuration().configure().addAnnotatedClass(HelloWorld.class);
       org.hibernate.SessionFactory sf = con.buildSessionFactory();
       
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       HelloWorld hm=new HelloWorld("hello world");
       
       session.save(hm);
       tx.commit();
    }
}
