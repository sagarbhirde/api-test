package com.example.demo.service;

import com.example.demo.model.Entity;
import com.example.demo.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntityService {

    @Autowired
    private EntityRepository entityRepository;

    public Optional<Entity> getEntityById(int id) {
        return entityRepository.findById(id);
    }
}