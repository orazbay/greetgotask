package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class IndexController {

    @GetMapping("/")
    ModelAndView index(){
        return new ModelAndView("index");
    }
}
