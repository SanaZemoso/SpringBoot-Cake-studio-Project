package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.io.UnsupportedEncodingException;

import static
        org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;

class AdminControllerTest
{
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext context;

    @Mock
    private CategoryService categoryService;

    @Mock
   private ProductService productService;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void adminHome() {
    }

    @Test
    void getCat()
    {

    }

    @Test
    void getCatAdd()  {

    }

    @Test
    void postCatAdd() throws Exception {
//     Category category = new Category(6,"toffy");
//     String jsonRequest = objectMapper.writeValueAsString(category);
//
//     MvcResult result= mockMvc
//             .perform(post("/admin/categories/add")
//                     .content(jsonRequest).
//                     contentType(MediaType.APPLICATION_JSON_VALUE))
//             .andExpect(status().isOk()).andReturn();
//
//     String resultContext = result.getResponse().getContentAsString();

    }

    @Test
    void deleteCat() {
    }

    @Test
    void updateCat() {
    }

    @Test
    void products() {
    }

    @Test
    void productAddGet() {
    }

    @Test
    void productAddPost() {
    }

    @Test
    void deleteProduct() {
    }

    @Test
    void updateProductGet() {
    }
}