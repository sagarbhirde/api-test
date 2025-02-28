package com.example.demo.controller;

import com.example.demo.dto.EntityDTO;
import com.example.demo.model.Student;
import com.example.demo.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/test")
public class TestController {


    // field injection
//    @Autowired
//    private EntityService entityService;

    private EntityService entityService;

    // setter injection
    @Autowired
    public void setEntityService(EntityService entityService) {
        this.entityService = entityService;
    }

//    //constructor injection
//    @Autowired
//    public TestController(EntityService entityService) {
//        this.entityService = entityService;
//    }

    @GetMapping("/entity")
    public EntityDTO getEntity() {
        EntityDTO entity = entityService.getEntityById(2); // Assuming you want to get the entity with id 1
        if(entity!=null){
            return entity;
        } else {
            return null; // Or handle the case where the entity is not found
        }
    }

    @GetMapping("/entityDataByRequest")
    public EntityDTO getEntity(@RequestParam int id) {
        EntityDTO entity = entityService.getEntityById(id);
       if(entity!=null){
            return entity;
        } else {
            return null; // Or handle the case where the entity is not found
        }
    }

//    @GetMapping("/entity/{id}")
//    public EntityDTO getEntityById(@PathVariable int id) {
//        Optional<Student> entity = entityService.getEntityById(id);
//        if (entity.isPresent()) {
//            Student e = entity.get();
//            return new EntityDTO(e.getId(), e.getName());
//        } else {
//            return null; // Or handle the case where the entity is not found
//        }
//    }
}