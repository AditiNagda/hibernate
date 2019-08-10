package com.mycompany.demoonetomany.entity;

import java.sql.Blob;
import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author aditi
 */

@Entity
@Table(name = "attachment")
public class Attachment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @Column(name = "filename")
    private String fileName;
    
    @Column(name = "filesize")
    private String fileSize;
    
    @Column(name = "created")
    private Timestamp created;
    
    @Column(name = "attachmentbytes")
    private byte[] attachmentBytes;
    
//     @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//						 CascadeType.DETACH, CascadeType.REFRESH})
//    private Proposal proposal;
//     
//      @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//						 CascadeType.DETACH, CascadeType.REFRESH})
//     private Personnel personnel;
     

    public Attachment() {
    }

    public Attachment(String fileName, String fileSize, Timestamp created, byte[] attachmentBytes) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.created = created;
        this.attachmentBytes = attachmentBytes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public byte[] getAttachmentBytes() {
        return attachmentBytes;
    }

    public void setAttachmentBytes(byte[] attachmentBytes) {
        this.attachmentBytes = attachmentBytes;
    }
    
    

}
