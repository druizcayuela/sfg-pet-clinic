package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

}
