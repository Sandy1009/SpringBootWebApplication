package com.example.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Welcome2Controller {

    // here we in the url we are giving "name" but the method is storing that value in "myName" variable

   // @RequestMapping("welcome")
    public String welcome2(@RequestParam("name") String myName, HttpSession session) {
        System.out.println("Welcome2 method called by "+myName);
        session.setAttribute("name", myName);
        return "pages/welcome";
    }

}
