package com.example.demo.service;


import com.example.demo.dto.EntityDTO;
import com.example.demo.model.Student;
import com.example.demo.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntityService {

    @Autowired
    private EntityRepository entityRepository;

    public EntityDTO getEntityById(int id) {

        Optional<Student> student =entityRepository.findById(id);
        EntityDTO entityDTO = null;
        if(student.isPresent()){
            Student s = student.get();
            entityDTO = new EntityDTO();
            entityDTO.setName(s.getName() + " " + "JSPM");
            entityDTO.setId(s.getId());
        }
        return entityDTO;
    }
}