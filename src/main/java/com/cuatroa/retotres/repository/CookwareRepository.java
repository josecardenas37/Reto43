package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.Cookware;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retotres.repository.crud.CookwareCrudRepository;

/**
 *
 * @author desaextremo
 */
@Repository
public class CookwareRepository {
    @Autowired
    private CookwareCrudRepository accesoryCrudRepository;

    public List<Cookware> getAll() {
        return accesoryCrudRepository.findAll();
    }

    public Optional<Cookware> getAccesory(String reference) {
        return accesoryCrudRepository.findById(reference);
    }
    
    public Cookware create(Cookware accesory) {
        return accesoryCrudRepository.save(accesory);
    }

    public void update(Cookware accesory) {
        accesoryCrudRepository.save(accesory);
    }
    
    public void delete(Cookware accesory) {
        accesoryCrudRepository.delete(accesory);
    }
}
