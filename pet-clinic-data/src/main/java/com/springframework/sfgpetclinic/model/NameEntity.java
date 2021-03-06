package com.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class NameEntity extends BaseEntity {

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public NameEntity(Long id, String name) {
        super(id);
        this.name = name;
    }
}
