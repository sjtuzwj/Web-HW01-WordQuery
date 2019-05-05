package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
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



@RestController
@RequestMapping(value="/login")
public class LoginController {
    @RequestMapping(value="",method= RequestMethod.GET)
    public Boolean login(String Username, String password){
        if( Username.equals("a") && password.equals("b"))
            return true;
        return false;
    }
}