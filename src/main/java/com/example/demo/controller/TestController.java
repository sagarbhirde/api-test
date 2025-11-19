package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EntityDTO;
import com.example.demo.service.EntityService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private final Logger logger=LoggerFactory.getLogger(TestController.class);

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // field injection
    @Autowired
    private EntityService entityService;

//    private EntityService entityService;
//
//    // setter injection
//    @Autowired
//    public void setEntityService(EntityService entityService) {
//        this.entityService = entityService;
//    }

//    //constructor injection
//    @Autowired
//    public TestController(EntityService entityService) {
//        this.entityService = entityService;
//    }

    @GetMapping("/entity")
    public EntityDTO getEntity() {
        logger.info("this is first logging into application and method");
        EntityDTO entity = entityService.getEntityById(2); // Assuming you want to get the entity with id 1
        if(entity!=null){
            return entity;
        } else {
            return null; // Or handle the case where the entity is not found
        }
    }


    @GetMapping("/entityDataByRequest")
    public ResponseEntity<?> getEntity(@RequestParam(value = "id", required = false) Integer id) {
        try {
            if (id == null) {
                NullPointerException npe = new NullPointerException("ID request is null");
                logger.error("NullPointerException occurred for entityId={}: {}", id, npe.getMessage(), npe);
                throw npe;
            }
            if (id <= 0) {
                logger.warn("Bad request for entityId={}", id);
                return ResponseEntity.badRequest().body("Invalid ID: " + id);
            }
            EntityDTO entity = entityService.getEntityById(id);
            if (entity != null) {
                logger.info("Entity found for entityId={}", id);
                try {
                    String entityJson = objectMapper.writeValueAsString(entity);
                    logger.info("Entity response for entityId={}: {}", id, entityJson);
                } catch (JsonProcessingException e) {
                    logger.error("Failed to serialize entity for entityId={}: {}", id, e.getMessage(), e);
                }
                return ResponseEntity.ok(entity);
            } else {
                logger.warn("Entity not found for entityId={}", id);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entity not found for id: " + id);
            }
        } catch (NullPointerException npe) {
            logger.error("Caught NullPointerException for entityId={}: {}", id, npe.getMessage(), npe);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("NullPointerException: " + npe.getMessage());
        } catch (Exception e) {
            logger.error("Exception while fetching entity for entityId={}: {}", id, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error for id: " + id);
        }
    }

    @GetMapping("/add")
    public int add(@RequestParam int num1, @RequestParam int num2) {
        return entityService.add(num1, num2);
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