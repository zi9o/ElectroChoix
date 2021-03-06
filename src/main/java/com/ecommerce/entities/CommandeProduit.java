package com.ecommerce.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

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

    public Integer getCommandeProduitId() {
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




