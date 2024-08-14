package com.example.Student_Library_Management_System.controller;

import java.io.ObjectInputFilter.Status;

import org.apache.tomcat.util.http.parser.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import com.example.Student_Library_Management_System.Contollers.AuthorController;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Services.AuthorSerivce;
import com.example.Student_Library_Management_System.Services.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import org.springframework.test.web.servlet.MvcResult;

@WebMvcTest(AuthorController.class)
public class AuthorControllerTest {
@Autowired
    private MockMvc mockMvc;

  

@Test
void addAuthor(){
   Author author=new Author();
          author.setAge(27);
          author.setCountry("india");
          author.setId(2);
          author.setName("bhargav");
          author.setRating(3.5);

        //   authorService.createAuthor(author).
        // mockMvc.perform(MockMvcRequestBuilders.post("/author/add")).content(author.jsonString()).
        // mockMvc.perform(post("/author/add")).contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(author)).andExpect(status().isOk()).andReturn().doPrint();
        // MvcResult result = mockMvc.perform(post("/author/add")  // Make sure this line is correct
        //         .contentType(MediaType.APPLICATION_JSON)
        //         .content(objectMapper.writeValueAsString(author)))
        //         .andExpect(status().isOk())
        //         .andExpect(content().string("Author added"))
        //         .andReturn();
    }


}
