package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

   // @RequestMapping("welcome")
    public String welcome(HttpServletRequest req) {
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        System.out.println("Welcome "+name);
        session.setAttribute("name", name);
        return "pages/welcome";
    }

}
