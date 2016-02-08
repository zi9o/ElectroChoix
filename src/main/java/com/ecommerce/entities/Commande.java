/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author nawalti
 */
@Entity
@Table(name = "commande")

public class Commande {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Column(name = "ID_COMMANDE")
    private Integer idCommande;
    
    @Column(name = "NUM_COMMANDE")
    private Integer numCommande;
    
    @Column(name = "DATE_commande")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dATEcommande;
    
    @Column(name = "MONTANT_TOTAL")
    private Float montantTotal;
    
    @Size(max = 50)
    @Column(name = "ETAT_REGLEMENT")
    private String etatReglement;
    
    @Size(max = 50)
    @Column(name = "TYPE_REGLEMENT")
    private String typeReglement;
    
    @Column(name = "RECEPTION_BON_ACHAT")
    private Integer receptionBonAchat;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;
    
    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
        private Client idClient;

    public Date getdATEcommande() {
        return dATEcommande;
    }

    public Client getIdClient() {
        return idClient;
    }

    public void setdATEcommande(Date dATEcommande) {
        this.dATEcommande = dATEcommande;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }
    
    
    
    public Commande() {
    }

    public Commande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Integer getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(Integer numCommande) {
        this.numCommande = numCommande;
    }

    public Date getDATEcommande() {
        return dATEcommande;
    }

    public void setDATEcommande(Date dATEcommande) {
        this.dATEcommande = dATEcommande;
    }

    public Float getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(Float montantTotal) {
        this.montantTotal = montantTotal;
    }

    public String getEtatReglement() {
        return etatReglement;
    }

    public void setEtatReglement(String etatReglement) {
        this.etatReglement = etatReglement;
    }

    public String getTypeReglement() {
        return typeReglement;
    }

    public void setTypeReglement(String typeReglement) {
        this.typeReglement = typeReglement;
    }

    public Integer getReceptionBonAchat() {
        return receptionBonAchat;
    }

    public void setReceptionBonAchat(Integer receptionBonAchat) {
        this.receptionBonAchat = receptionBonAchat;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }

    @Override
    public String toString() {
        return "entities.Commande[ idCommande=" + idCommande + " ]";
    }
}
