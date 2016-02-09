/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 *
 * @author nawalti
 */

@Entity
@Table(name = "galerie")

public class Galerie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_GALERIE")
    private Integer idGalerie;
    
    @Size(max = 250)
    @Column(name = "IMAGE")
    private String image;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;

     /*  08-02-2016-16:00  */

    @ManyToOne
    @JoinColumn(name="ID_PRODUIT")
    private Produit produit;

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    /*  08-02-2016-16:00  */

    public Galerie() {
    }

    public Galerie(Integer idGalerie) {
        this.idGalerie = idGalerie;
    }

    public Integer getGalerieId() {
        return idGalerie;
    }

    public void setIdGalerie(Integer idGalerie) {
        this.idGalerie = idGalerie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }

    @Override
    public String toString() {
        return "entities.Galerie[ idGalerie=" + idGalerie + " ]";
    }

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
}
