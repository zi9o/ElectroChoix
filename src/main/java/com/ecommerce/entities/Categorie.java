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
    private Integer idCategorie;
    @Size(max = 50)
    
    @Column(name = "LIBELLE")
    private String libelle;
    @Size(max = 200)
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;
    
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produitList;
    
    @OneToMany(mappedBy = "categorie")
    private List<Propriete> proprieteList;

    @Transient
    public List<Propriete> getProprieteList() {
        return proprieteList;
    }

    public void setProprieteList(List<Propriete> proprieteList) {
        this.proprieteList = proprieteList;
    }
    
    public Categorie() {
    }

    public Categorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Transient
    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
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
        return "entities.Categorie[ idCategorie=" + idCategorie + " ]";
    }
    
}
