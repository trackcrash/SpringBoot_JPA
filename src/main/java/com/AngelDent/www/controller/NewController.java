package com.AngelDent.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
    @GetMapping
    public String index(){
        return "index";
    }
}
