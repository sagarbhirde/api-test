package com.example.demo.controller;

import com.example.demo.dto.EntityDTO;
import com.example.demo.model.Entity;
import com.example.demo.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private EntityService entityService;

    @GetMapping("/entity")
    public EntityDTO getEntity() {
        Optional<Entity> entity = entityService.getEntityById(1); // Assuming you want to get the entity with id 1
        if (entity.isPresent()) {
            Entity e = entity.get();
            return new EntityDTO(e.getId(), e.getName());
        } else {
            return null; // Or handle the case where the entity is not found
        }
    }
}