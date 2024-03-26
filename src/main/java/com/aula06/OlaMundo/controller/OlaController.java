package com.aula06.OlaMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
    @GetMapping("/")
    public String getOlaMundo(){
        return"Olá Mundo";
    }
    
}
