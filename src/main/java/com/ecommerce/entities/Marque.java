/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 *
 * @author nawalti
 */
@Entity
@Table(name = "marque")
public class Marque {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MARQUE")
    private Integer idMarque;
    
    @Size(max = 50)
    @Column(name = "INTITULE")
    private String intitule;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;
    
    @OneToMany(mappedBy = "marque")
    private List <Produit> produits;


    //
    @Column(name = "DATE_CREATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date DATECREATION;

    @Column(name = "DATE_UPDATE ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date DATEUPDATE ;

    public Date getDATECREATION() {
        return DATECREATION;
    }

    public void setDATECREATION(Date DATECREATION) {
        this.DATECREATION = DATECREATION;
    }

    public Date getDATEUPDATE() {
        return DATEUPDATE;
    }

    public void setDATEUPDATE(Date DATEUPDATE) {
        this.DATEUPDATE = DATEUPDATE;
    }

    //
    public Integer getMarqueId() {
        return idMarque;
    }
       
    public void setIdMarque(Integer idMarque) {
        this.idMarque = idMarque;
    }

    @Transient
    public List <Produit> getProduits() {
        return produits;
    }

    public void setProduits(List <Produit> produits) {
        this.produits = produits;
    }

    /* 08-02-2016-16:00  */

/*  08-02-2016-16:00  */
    
    public Marque() {
    }

    public Marque(Integer idMarque) {
        this.idMarque = idMarque;
    }
        
    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }
  
    @Override
    public String toString() {
        return "entities.Marque[ idMarque=" + idMarque + " ]";
    }
    
}
