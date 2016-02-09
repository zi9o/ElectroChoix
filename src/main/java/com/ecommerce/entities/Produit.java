/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

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

    /* 08-02-2016-16:00  */

    @OneToMany(mappedBy = "produit")
    private List<Galerie> galeries;

    @Transient
    public List<Galerie> getGaleries() {
        return galeries;
    }

    public void setGaleries(List<Galerie> galeries) {
        this.galeries = galeries;
    }

    @OneToMany(mappedBy = "produit")
    private List<ProduitPropriete> proprietes;

    @Transient
    public List<ProduitPropriete> getProprietes() {
        return proprietes;
    }

    public void setProprietes(List<ProduitPropriete> proprietes) {
        this.proprietes = proprietes;
    }


    /*  08-02-2016-16:00  */

    //@Transient
    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
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
    
    public Produit() {
    }

    //@Transient
    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Produit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public Integer getProduitId() {
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
