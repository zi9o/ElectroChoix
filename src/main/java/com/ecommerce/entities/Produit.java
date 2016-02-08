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
@Table(name = "produit")

public class Produit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PRODUIT")
    private Integer idProduit;
    
    @Size(max = 50)
    @Column(name = "DESIGNATION")
    private String designation;
    
    @Column(name = "PRIX")
    private Float prix;
    
    @Column(name = "QUANTITE_STOCK")
    private Integer quantiteStock;
    
    @Column(name = "TAUX_REMISE")
    private Integer tauxRemise;
    
    @Size(max = 250)
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;
    
    
    @ManyToOne
    @JoinColumn(name="ID_CATEGORIE")
    private Categorie categorie;
    
    @ManyToOne
    @JoinColumn(name="ID_MARQUE")
    private Marque marque;

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    
    
    public Produit() {
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Produit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public Integer getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Integer getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(Integer quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public Integer getTauxRemise() {
        return tauxRemise;
    }

    public void setTauxRemise(Integer tauxRemise) {
        this.tauxRemise = tauxRemise;
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
        return "entities.Produit[ idProduit=" + idProduit + " ]";
    }
    
}
