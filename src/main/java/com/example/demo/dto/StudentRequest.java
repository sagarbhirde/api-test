package com.example.demo.dto;

import org.antlr.v4.runtime.misc.NotNull;
import org.apache.logging.log4j.message.Message;

import java.util.List;

public class StudentRequest {

    private List<Integer> studentIds;

    public List<Integer> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Integer> studentIds) {
        this.studentIds = studentIds;
    }
}
