package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.Cookware;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author desaextremo
 */
public interface CookwareCrudRepository extends MongoRepository<Cookware, String> {
    
}
