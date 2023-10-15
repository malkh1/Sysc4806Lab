package com.mycompany.mavenproject1.controllers;

import com.mycompany.mavenproject1.models.AddressBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Mohammad 101162465
 */
@RepositoryRestResource(path ="books")
public interface AddressBookRepository extends CrudRepository<AddressBook, Long>{
    
}
