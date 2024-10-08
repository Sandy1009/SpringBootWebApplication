package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewWelcomeController {

    @RequestMapping("welcome")
    public ModelAndView welcome3(@RequestParam("name") String myName) {     //here name is the thing sent from url and in the program we are referring to that with "myName"
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", myName);
        mv.setViewName("pages/welcome");
        System.out.println("Model and View controller called.... ");
        return mv;
    }
}
