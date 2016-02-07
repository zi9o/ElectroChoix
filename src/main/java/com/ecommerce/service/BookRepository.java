/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.service;

import com.ecommerce.entities.Book;
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author DIALLO-IMRANA
 */
@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Integer>  {
    
}
