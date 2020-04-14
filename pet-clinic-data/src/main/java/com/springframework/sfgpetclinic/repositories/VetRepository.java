package com.springframework.sfgpetclinic.repositories;

import com.springframework.sfgpetclinic.model.Vet;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Collection;

public interface VetRepository extends CrudRepository<Vet, Long> {

    @Transactional
    @Cacheable("vets")
    Collection<Vet> findAll() throws DataAccessException;
}
