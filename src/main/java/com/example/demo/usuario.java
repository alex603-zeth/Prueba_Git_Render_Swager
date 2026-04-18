package com.example.demo;

import jdk.jfr.ContentType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.AbstractDocument;

@RestController
public class usuario {
    @GetMapping("hola")
    public String hola(){
        return "Hola Mundo!!";
    }



}
