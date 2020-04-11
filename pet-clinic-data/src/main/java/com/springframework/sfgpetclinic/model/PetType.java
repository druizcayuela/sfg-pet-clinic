package com.springframework.sfgpetclinic.model;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends NameEntity {
}
