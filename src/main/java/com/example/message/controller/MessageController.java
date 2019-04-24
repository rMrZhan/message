package com.example.message.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
    @GetMapping("/test")
    public ModelAndView test(ModelAndView modelAndView){
        modelAndView.addObject("index.jsp");
        return modelAndView;
    }
}
