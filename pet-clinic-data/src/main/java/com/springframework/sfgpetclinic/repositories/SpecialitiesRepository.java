package com.springframework.sfgpetclinic.repositories;

import com.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialitiesRepository extends CrudRepository<Speciality, Long> {
}
