package com.ecommerce.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by nawalti on 08/02/2016.
 */
@Entity
@Table(name = "commande_produit")
public class CommandeProduit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_COMMANDE_PRODUIT")
    private Integer idCommandeProduit;

    @Column(name = "QUANTITE")
    private Integer quantite;

    @Column(name = "STATUT_DB")
    private Integer statutDb;


    @ManyToOne
    @JoinColumn(name = "ID_COMMANDE")
    private Commande commande;

//////////////
    @ManyToOne
    @JoinColumn(name = "ID_PRODUIT")
    private Produit produit;


    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

/////////////////

    @Transient
    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public CommandeProduit() {
    }

    public CommandeProduit(Integer idCommandeProduit) {
        this.idCommandeProduit = idCommandeProduit;
    }

    public Integer getIdCommandeProduit() {
        return idCommandeProduit;
    }

    public void setIdCommandeProduit(Integer idCommandeProduit) {
        this.idCommandeProduit = idCommandeProduit;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }

    @Override
    public String toString() {
        return "entities.CommandeProduit[ idCommandeProduit=" + idCommandeProduit + " ]";
    }

}




