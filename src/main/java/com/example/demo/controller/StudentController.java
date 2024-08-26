package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.pojo.Student;

import java.util.Collections;

@Controller
public class StudentController {

    @Autowired
    StudentDao studentDao;

    @RequestMapping("student1")
    public ModelAndView studentDetails(Student st) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", st);
        System.out.println("Student1 controller called..... "+st.getSid()+"  "+st.getSname()+"   "+st.getSlang());
        mv.setViewName("pages/student1");
        return mv;
    }

    @RequestMapping("addStudent")
    public String addStudent(Student st) {
        studentDao.save(st);
        return "pages/student";
    }

    @RequestMapping("getStudent")
    public ModelAndView getStudent(@RequestParam int sid) {
        ModelAndView mv = new ModelAndView();
        Student st = studentDao.findById(sid).orElse(new Student());
        mv.addObject("st", st);
        mv.setViewName("pages/showStudent");
        System.out.println(st);
        return mv;
    }

}



/*
https://www.youtube.com/watch?v=35EQXmHKZYs&t=4605s

https://github.com/navinreddy20/Spring-Boot/blob/master/bootjpa1/src/main/java/com/telusko/demo/controller/AlienController.java
 */