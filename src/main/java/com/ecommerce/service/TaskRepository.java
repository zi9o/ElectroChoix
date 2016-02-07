/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.service;

import com.ecommerce.entities.Task;
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
 
@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Integer> {
 
    List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
    List<Task> findByTaskStatus(@Param("status") String taskStatus);
 
}


