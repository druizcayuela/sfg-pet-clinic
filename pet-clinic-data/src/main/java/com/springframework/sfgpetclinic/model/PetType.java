package com.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends NameEntity {

    @Builder
    public PetType(Long id, String name) {
        super(id, name);
    }
}
