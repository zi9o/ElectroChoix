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
@Table(name = "propriete")

public class Propriete {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Column(name = "ID_PROPRIETE")
    private Integer idPropriete;
    
    @Size(max = 50)
    @Column(name = "LIBELLE")
    private String libelle;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;
    
    @ManyToOne
    @JoinColumn(name="ID_CATEGORIE")
    private Categorie categorie;

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
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

    public Propriete() {
    }

    public Propriete(Integer idPropriete) {
        this.idPropriete = idPropriete;
    }

    public Integer getProprieteId() {
        return idPropriete;
    }

    public void setIdPropriete(Integer idPropriete) {
        this.idPropriete = idPropriete;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }

    @Override
    public String toString() {
        return "entities.Propriete[ idPropriete=" + idPropriete + " ]";
    }
    
}
