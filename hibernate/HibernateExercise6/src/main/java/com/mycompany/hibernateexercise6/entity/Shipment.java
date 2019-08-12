package com.mycompany.hibernateexercise6.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author aditi
 */
@Entity
@Table(name = "shipment")
public class Shipment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @Column(name = "inspection_period_days")
    private int inspectionPeriodDays;
    
    @Column(name = "state")
    private String state;
    
    @Column(name = "created")
    @Temporal(TemporalType.DATE)
    private Date created;

    public Shipment() {
    }

    public Shipment(int inspectionPeriodDays, String state, Date created) {
        this.inspectionPeriodDays = inspectionPeriodDays;
        this.state = state;
        this.created = created;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getInspectionPeriodDays() {
        return inspectionPeriodDays;
    }

    public void setInspectionPeriodDays(int inspectionPeriodDays) {
        this.inspectionPeriodDays = inspectionPeriodDays;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
    
    

}
