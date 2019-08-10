package com.mycompany.demoonetomany.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author aditi
 */
@Entity
@Table(name = "proposal")
public class Proposal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long DocID;
    
    @Column(name = "title",length = 100)
    private String Title;
    
    @Column(name = "comment" , length = 1000)
    private String Comment;
    
    @OneToMany( cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
    @Column(name = "personnel")
    private List<Personnel> personnel;
    
    @OneToMany( cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
    @Column(name = "attachment")
    private List<Attachment> attachments;

    public Proposal() {
    }

    public Proposal(String Title, String Comment, List<Personnel> personnel, List<Attachment> attachments) {
        this.Title = Title;
        this.Comment = Comment;
        this.personnel = personnel;
        this.attachments = attachments;
    }

   

    public long getDocID() {
        return DocID;
    }

    public void setDocID(long DocID) {
        this.DocID = DocID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public List<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(List<Personnel> personnel) {
        this.personnel = personnel;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

   
  
    

}
