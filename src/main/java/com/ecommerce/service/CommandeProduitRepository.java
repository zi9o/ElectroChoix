/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.service;

import com.ecommerce.entities.CommandeProduit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 *
 * @author nawalti
 */

@RepositoryRestResource
public interface CommandeProduitRepository extends CrudRepository<CommandeProduit, Integer> {
 
    
}
