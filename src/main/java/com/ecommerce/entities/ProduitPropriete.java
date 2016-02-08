package com.ecommerce.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by nawalti on 08/02/2016.
 */
@Entity
@Table(name = "produit_propriete")
public class ProduitPropriete {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PRODUIT_PROPRIETE")
    private Integer idProduitPropriete;

    @Size(max = 50)
    @Column(name = "VALEUR")
    private String valeur;

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

    @ManyToOne
    @JoinColumn(name="ID_PROPRIETE")
    private Propriete propriete;

    @Transient
    public Propriete getPropriete() {
        return propriete;
    }

    public void setPropriete(Propriete propriete) {
        this.propriete = propriete;
    }

/*  08-02-2016-16:00  */

    public ProduitPropriete() {
    }

    public ProduitPropriete(Integer idProduitPropriete) {
        this.idProduitPropriete = idProduitPropriete;
    }

    public Integer getIdProduitPropriete() {
        return idProduitPropriete;
    }

    public void setIdProduitPropriete(Integer idProduitPropriete) {
        this.idProduitPropriete = idProduitPropriete;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }

    @Override
    public String toString() {
        return "entities.ProduitPropriete[ idProduitPropriete=" + idProduitPropriete + " ]";
    }

}
