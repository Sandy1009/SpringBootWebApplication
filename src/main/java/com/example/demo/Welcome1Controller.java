package com.example.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome1Controller {

   // @RequestMapping("welcome")
    public String welcome1(String name, HttpSession session) {            //without using HttpRequest. Here name matches with the parameter given in URL
        System.out.println("Welcome1 method called by "+name);
        session.setAttribute("name", name);
        return "pages/welcome";
    }

}
