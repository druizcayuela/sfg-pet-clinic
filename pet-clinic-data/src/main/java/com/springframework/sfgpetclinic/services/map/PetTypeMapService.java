package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.PetType;
import com.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

}
