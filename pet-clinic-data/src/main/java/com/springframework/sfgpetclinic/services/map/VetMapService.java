package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.Speciality;
import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.services.SpecialitiesService;
import com.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialitiesService specialitiesService;

    public VetMapService(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }


    @Override
    public Vet save(Vet object) {

        if (!object.getSpecialities().isEmpty()) {
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null) {
                    Speciality savedSpeciality = specialitiesService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);
    }
}
