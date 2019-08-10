package com.mycompany.demoonetomany.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author aditi
 */
@Entity
@Table(name = "personnel")
public class Personnel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @Column(name = "name", length = 60)
    private String Name;

    public QualificationLevel.values getQualificationLevel() {
        return qualificationLevel;
    }

    public void setQualificationLevel(QualificationLevel.values qualificationLevel) {
        this.qualificationLevel = qualificationLevel;
    }
    
    
  
    @Column(name = "qualification_level")
    @Enumerated(EnumType.STRING)
    private QualificationLevel.values qualificationLevel;
    
    @Column(name = "phone")
    @Size(min=10,max=10)
    @Pattern(regexp="(^$|[0-9]{10})")
    private String Phone;
    
  
    @OneToMany( cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
    private List<Attachment> attachments;

    public Personnel() {
    }

    public Personnel(String Name, QualificationLevel.values qualificationLevel, String Phone) {
        this.Name = Name;
        this.qualificationLevel = qualificationLevel;
        this.Phone = Phone;
    }

   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    
    
    
    

}
