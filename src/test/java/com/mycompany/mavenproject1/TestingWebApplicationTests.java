package com.mycompany.mavenproject1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.mavenproject1.controllers.HomeController;
import com.mycompany.mavenproject1.models.BuddyInfo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Assertions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
/**
 *
 * @author Mohammad 101162465
 */
@SpringBootTest
@AutoConfigureMockMvc
public class TestingWebApplicationTests {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Autowired
    private HomeController controller;
    
    @Test
    public void contextLoads() {
        try{
            assertThat(controller).isNotNull();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testGET() throws Exception {
        mockMvc.perform(get("/home"))
                .andDo(print())
                .andExpect(status().isOk()).
                andExpect(content().string(containsString("List")));
        
        mockMvc.perform(get("/buddies"))
                .andDo(print())
                .andExpect(status().isOk()).
                andExpect(content().string(containsString("jimmy")));
    }
    
    @Test 
    public void testPOST() throws Exception {
        BuddyInfo testBuddy = new BuddyInfo("james", "613-224-6673");
        String jamesAsJson = new ObjectMapper().writeValueAsString(testBuddy);
        var requestBuilder = MockMvcRequestBuilders.post("/buddies")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(jamesAsJson);
        var result = mockMvc.perform(requestBuilder).andReturn();
        Assertions.assertEquals(HttpStatus.CREATED.value(),
                result.getResponse().getStatus());


    }
    
    @Test 
    public void testDelete() throws Exception {
        
    }
       
}
