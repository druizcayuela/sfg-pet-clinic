package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.Speciality;
import com.springframework.sfgpetclinic.services.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialitiesMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {

}
