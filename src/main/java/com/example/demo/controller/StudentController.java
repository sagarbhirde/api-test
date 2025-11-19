package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.StudentRequest;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/info")
    public ResponseEntity<List<StudentDTO>> getStudentInfo(@Valid @RequestBody StudentRequest studentRequest){
        List<StudentDTO> studentResponse = service.getStudentInfo(studentRequest.getStudentIds());
        return ResponseEntity.ok(studentResponse);
    }
}
