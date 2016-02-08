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
import javax.validation.constraints.Size;

/**
 *
 * @author nawalti
 */

@Entity
@Table(name = "galerie")

public class Galerie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_GALERIE")
    private Integer idGalerie;
    
    @Size(max = 250)
    @Column(name = "IMAGE")
    private String image;
    
    @Column(name = "STATUT_DB")
    private Integer statutDb;    

    public Galerie() {
    }

    public Galerie(Integer idGalerie) {
        this.idGalerie = idGalerie;
    }

    public Integer getIdGalerie() {
        return idGalerie;
    }

    public void setIdGalerie(Integer idGalerie) {
        this.idGalerie = idGalerie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getStatutDb() {
        return statutDb;
    }

    public void setStatutDb(Integer statutDb) {
        this.statutDb = statutDb;
    }

    @Override
    public String toString() {
        return "entities.Galerie[ idGalerie=" + idGalerie + " ]";
    }
    
}
