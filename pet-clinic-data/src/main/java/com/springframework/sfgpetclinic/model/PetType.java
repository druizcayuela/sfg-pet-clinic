package com.springframework.sfgpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends NameEntity {

    @Builder
    public PetType(Long id, String name) {
        super(id, name);
    }
}
