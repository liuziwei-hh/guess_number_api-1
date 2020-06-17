package com.twschool.practice.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class GuessGameControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_return_input_1234_and_result_4A0B_when_request_url_guessGame_with_param_input_1234() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/guessGame")
                .contentType(MediaType.APPLICATION_JSON)
                .param("input", "1 2 3 4"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.input").value("1 2 3 4"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value("4A0B"));
    }
}
