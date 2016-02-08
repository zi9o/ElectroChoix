/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

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

    

    public Propriete() {
    }

    public Propriete(Integer idPropriete) {
        this.idPropriete = idPropriete;
    }

    public Integer getIdPropriete() {
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
