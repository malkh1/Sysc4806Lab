package com.mycompany.mavenproject1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.mavenproject1.controllers.HomeController;
import com.mycompany.mavenproject1.models.BuddyInfo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 *
 * @author Mohammad 101162465
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestingWebApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private HomeController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
        assertThat(mockMvc).isNotNull();
        if (controller == null) {
            System.out.println("controller failed to autowire");
        } else {
            System.out.println("controller autowire success");
        }
        if (mockMvc == null) {
            System.out.println("mockmvc autowire fail");
        } else {
            System.out.println("mockmvc autowire success");
        }
        System.out.println(mockMvc.toString());
        assertThat(mockMvc.toString()).isNotNull();
    }

    @Test
    public void testGET() {
        try {
            mockMvc.perform(get("/home"))
                    .andDo(print())
                    .andExpect(status().isOk()).
                    andExpect(content().string(containsString("List")));

            mockMvc.perform(get("/buddies"))
                    .andDo(print())
                    .andExpect(status().isOk()).
                    andExpect(content().string(containsString("jimmy")));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testPOST() {
        try {
            BuddyInfo testBuddy = new BuddyInfo("james", "613-224-6673", "1992 abc rd");
            String jamesAsJson = new ObjectMapper().writeValueAsString(testBuddy);
            var requestBuilder = MockMvcRequestBuilders.post("/buddies")
                    .accept(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(jamesAsJson);
            var result = mockMvc.perform(requestBuilder).andReturn();
            Assertions.assertEquals(HttpStatus.CREATED.value(),
                    result.getResponse().getStatus());

        } catch (Exception e) {

        }

    }

}
