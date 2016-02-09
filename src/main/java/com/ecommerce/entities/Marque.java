/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
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

    public Integer getIdMarque() {
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
