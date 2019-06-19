package com.wordquery.demo.controller;

import com.wordquery.demo.java.QueryResult;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ui.Model;

import java.io.*;

import com.wordquery.demo.java.WordQuery;


@RestController
@RequestMapping(value="/wordquery")
public class WordQueryController {
    @RequestMapping(value="/search/{input}",method= RequestMethod.GET)
    public QueryResult search(@PathVariable String input,Username u,password p){
        String Url="localhost:8000/login?Username={1}&password={2}";
        Boolean login=restTemplate.getForObject(Url, Boolean.class,u,p);
        if(!login) return null;
        WordQuery query = null;
        ClassPathResource dictPath = new ClassPathResource("demo.txt");
        try{
            String dictFilePath = dictPath.getFile().getAbsolutePath();
            query = new WordQuery(dictFilePath);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return query.interact(input);
    }
}
