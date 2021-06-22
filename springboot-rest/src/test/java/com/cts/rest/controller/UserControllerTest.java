package com.cts.rest.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import com.cts.rest.entity.User;
import com.cts.rest.model.ui.request.UserRequest;
import com.cts.rest.model.ui.response.UserResponse;
import com.cts.rest.service.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
	@Autowired
    private MockMvc mockMvc;
	 @Autowired
	 private WebApplicationContext webApplicationContext;
    @MockBean
    private UserServiceImpl userService;

    @MockBean
    private ModelMapper mockModelMapper;
    
    @BeforeEach
    public void setUp() {
      this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }
   
    
  
	
}
