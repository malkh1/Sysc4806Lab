package com.mycompany.mavenproject1.controllers;

import com.mycompany.mavenproject1.models.BuddyInfo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author Mohammad 101162465
 */
@RepositoryRestResource(path="buddies")
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long>{
    
    List<BuddyInfo> findByName(@Param("name") String name);
     
}
