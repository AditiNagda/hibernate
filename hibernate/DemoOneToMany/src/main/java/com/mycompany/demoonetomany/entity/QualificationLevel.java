package com.mycompany.demoonetomany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author aditi
 */
@Entity
@Table(name = "qualificationlevel")
public class QualificationLevel {
    
   public enum values{
        Beginner, Intermediate, Pro
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    

    public QualificationLevel() {
    }

   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   
    
    
    

}
