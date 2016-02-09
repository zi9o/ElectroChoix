/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;


/**
 *
 * @author nawalti
 */
@Entity
@Table(name = "categorie")

public class Categorie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Column(name = "ID_CATEGORIE")
    @JsonInclude
    private Integer id;
    @Size(max = 50)
    
    @Column(name = "LIBELLE")
    private String libelle;
    @Size(max = 200)
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;

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

    // recuperation de l'id
    @JsonGetter
    public Integer getCategorieId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }



    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;
    
    @OneToMany(mappedBy = "categorie")
    private List<Propriete> proprietes;


    @Transient
    public List<Propriete> getProprietes() {
        return proprietes;
    }

    public void setProprietes(List<Propriete> proprietes) {
        this.proprietes = proprietes;
    }

    public Categorie() {
    }

    public Categorie(Integer idCategorie) {
        this.id = idCategorie;
    }

    @Transient
    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }



    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }
    
    @Override
    public String toString() {
        return "entities.Categorie[ idCategorie=" + id + " ]";
    }
    
}
