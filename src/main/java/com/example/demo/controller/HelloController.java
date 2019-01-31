package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     *
     */

    private static final String STRING = "/";

    @RequestMapping(STRING)
    String home(){
        return "Hello my World!";
    }
}