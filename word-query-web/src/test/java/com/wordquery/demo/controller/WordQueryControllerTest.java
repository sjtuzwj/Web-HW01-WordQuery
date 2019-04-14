package com.wordquery.demo.controller;

import com.wordquery.demo.java.QueryResult;
import com.wordquery.demo.java.QueryResultItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;


import java.io.IOException;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WordQueryControllerTest {
    MockMvc mockMvc;
    @Autowired
    protected WebApplicationContext wac;
    @Autowired
    WordQueryController wqController;


    @Before
    public void setup() throws Exception {
        this.mockMvc = standaloneSetup(this.wqController).build();
    }

    @Test
    public void search(){
        try {
            mockMvc.perform(get("/wordquery/search/sword").contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk()).andDo(print()).
                    andExpect((ResultMatcher) jsonPath("$.line",is(2)))
                    .andExpect((ResultMatcher) jsonPath("$.time",is(1)));
        }
        catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
        }
    }
}