
package com.mycompany.hibernateexample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author aditi
 */

public class JpaTest {
    private static EntityManager em;
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence
                .createEntityManagerFactory("HelloWorld");
        em = emf.createEntityManager();
       create("hello world");
    }
    
     private static void create(String message) {
        em.getTransaction().begin();
        HelloWorld hw = new HelloWorld(message);
        em.persist(hw);
        em.getTransaction().commit();
    }
    
}
