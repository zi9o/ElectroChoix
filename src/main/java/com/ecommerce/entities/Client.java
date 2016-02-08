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

/**
 *
 * @author nawalti
 */
@Entity
@Table(name = "client")

public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CLIENT")
    private Integer idClient;
    
     @Column(name = "CODE_CLIENT")
    private Integer codeClient;
    @Size(max = 40)
    
    @Column(name = "NOM")
    private String nom;
    @Size(max = 40)
    
    @Column(name = "PRENOM")
    private String prenom;
     @Size(max = 100)
     
    @Column(name = "EMAIL")
    private String email;
     
    @Column(name = "SEXE")
    private Character sexe;
    @Size(max = 15)
    
    @Column(name = "TELEPHONE")
    private String telephone;
    @Size(max = 40)
    
    @Column(name = "VILLE")
    private String ville;
    @Size(max = 50)
    
    @Column(name = "REGION")
    private String region;
    @Size(max = 100)
    
    @Column(name = "ADRESSE")
    private String adresse;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;
    
    @OneToMany(mappedBy = "idClient")
    private List <Commande> commandeList;       

    public Integer getIdClient() {
        return idClient;
    }
       
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    
    @Transient
    public List<Commande> getCommandeList() {
        return commandeList;
    }

    @Transient
    public void setCommandeList(List<Commande> commandeList) {
        this.commandeList = commandeList;
    }
    
    public Client() {
    }

    public Client(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Integer codeClient) {
        this.codeClient = codeClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }

    @Override
    public String toString() {
        return "entities.Client[ idClient=" + idClient + " ]";
    }
}
