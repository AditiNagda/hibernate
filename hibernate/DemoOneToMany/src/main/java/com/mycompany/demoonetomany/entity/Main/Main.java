package com.mycompany.demoonetomany.entity.Main;

import com.mycompany.demoonetomany.entity.Attachment;
import com.mycompany.demoonetomany.entity.Personnel;
import com.mycompany.demoonetomany.entity.Proposal;
import com.mycompany.demoonetomany.entity.QualificationLevel;
import java.sql.Blob;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aditi
 */
public class Main {
    
    public static void main(String[] args) {
        
       
            Date d=new Date();
        Configuration con = new Configuration().configure()
                .addAnnotatedClass(Attachment.class)
                .addAnnotatedClass(Personnel.class)
                .addAnnotatedClass(Proposal.class)
                .addAnnotatedClass(QualificationLevel.class);

        org.hibernate.SessionFactory sf = con.buildSessionFactory();   
        Session session=sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //insert into personnel
        
//        Personnel personnel=new Personnel("Aditi", QualificationLevel.values.Beginner, "90000000000");
//        session.save(personnel);
//     
//        Personnel personnel2=new Personnel("Mohit", QualificationLevel.values.Beginner, "9000090000");
//        session.save(personnel2);
//      
//        List<Personnel> personList=new ArrayList<>();
//        personList.add(personnel);
//        personList.add(personnel2);
//        List<Attachment> attList=new ArrayList<>();
//        
//        //insert into proposal
//        Proposal proposal=new Proposal("Title","comments",personList,attList);
//        session.save(proposal);
//       
//        
//        //insert into attachment
//        Timestamp ts;
//        ts = new Timestamp(d.getTime());
//        String str="filename";
//        byte[] br=str.getBytes();
//        Attachment attachment=new Attachment("filename", "40mb",ts, br);
//        session.save(attachment);
//         tx.commit();
//         
         //delete from proposal
         Personnel p=new Personnel();
         p.setId(1);
         session.delete(p);
         tx.commit();
         
       
      
    }

}
