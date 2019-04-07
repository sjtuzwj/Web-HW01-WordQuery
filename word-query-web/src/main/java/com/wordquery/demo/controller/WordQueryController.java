package com.wordquery.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ui.Model;

import java.io.*;

import com.wordquery.demo.java.WordQuery;


@Controller
public class WordQueryController {
    @RequestMapping(value="/wordquery",method= RequestMethod.GET)
    public void wordquery(String input, Model model){
        String queryRes =" ";
        ClassPathResource dictPath = new ClassPathResource("demo.txt");
        try {
            String dictFilePath = dictPath.getFile().getAbsolutePath();
            WordQuery query = new WordQuery(dictFilePath);
            queryRes = query.interact(input);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        model.addAttribute("query", queryRes.toString());
    }
}