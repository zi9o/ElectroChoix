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
@Table(name = "administrateur")

public class Administrateur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    @Column(name = "ID_ADMIN")
    private Integer idAdmin;
    @Size(max = 40)
    
    @Column(name = "NOM")
    private String nom;
    @Size(max = 40)
    
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 100)
    
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 40)
    
    @Column(name = "PASSWORD")
    private String password;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;
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

    public Administrateur() {
    }

    public Administrateur(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Integer getAdminId() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }


    @Override
    public String toString() {
        return "entities.Administrateur[ idAdmin=" + idAdmin + " ]";
    }
}
