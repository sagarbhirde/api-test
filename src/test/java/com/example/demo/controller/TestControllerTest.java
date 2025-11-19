package com.example.demo.controller;

import com.example.demo.UserApplication;
import com.example.demo.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TestController.class)
@ContextConfiguration(classes = UserApplication.class)
public class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private EntityService service;

//    @Test
//    void testGetPoint() throws Exception {
//        mockMvc.perform(get("/entityDataByRequest"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("5")); // Test will fail initially
//    }

    @Test
    void testAddEndpoint() throws Exception {
        mockMvc.perform(get("/api/test/add?num1=2&num2=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("5")); // Test will fail initially
    }


}
