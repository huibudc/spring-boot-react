package com.huibudc.springBootReact.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
