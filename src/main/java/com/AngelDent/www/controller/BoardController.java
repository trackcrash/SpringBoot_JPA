package com.AngelDent.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/notice")
    public String notice(){
        return "board/notice";
    }
    @GetMapping("/write")
    public String write(){
        return "board/write";
    }
    @GetMapping("/contact")
    public String contact(){
        return "board/contact";
    }
}
