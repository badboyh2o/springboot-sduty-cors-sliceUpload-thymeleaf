package com.badboyh2o.maven.springboot.cors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {
    
    @RequestMapping(value = "/index")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("index");
        mv.addObject("name","欢迎使用Thymeleaf!");
        return mv;
    }
    
}