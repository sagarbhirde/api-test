package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {





    public List<StudentDTO> getStudentInfo(List<Integer> studentIds){
       List<StudentDTO> studentDtos = new ArrayList<>();
      return  studentDtos;
    }


}
