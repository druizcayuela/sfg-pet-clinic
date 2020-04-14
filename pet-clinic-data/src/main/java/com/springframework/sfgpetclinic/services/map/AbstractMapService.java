package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(T object) {

        if (object ==  null) {
            throw new RuntimeException("Object cannot be null");
        }

        if(object.getId() == null) {
            object.setId(getNextId());
        }

        map.put(object.getId(), object);
        return object;
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private Long getNextId() {

        Long nextId;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
