package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.Visit;
import com.springframework.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
            || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }
}
