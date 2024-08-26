/*
Using the endpoint we are hitting and fetching the results
 */

package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentRestController {

    @Autowired
    StudentDao studentDao;

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student st) {       // we need to mention param as @RequestBody to inform that we are sending the request
        studentDao.save(st);
        return st;
    }

    @PutMapping("/student")
    public Student saveOrUpdateStudent(@RequestBody Student st) {
        studentDao.save(st);
        return st;
    }

    @DeleteMapping("/student/{sid}")
    public String deleteStudent(@PathVariable int sid) {
        Student st = studentDao.getOne(sid);
        studentDao.delete(st);
        return "deleted";
    }

   // @RequestMapping(path="/students", produces={"application/xml"})     //supports only XMl. Gives the ouput in XML format only
   @GetMapping("/students")
    @ResponseBody
    public List<Student> getStudents() {
        return studentDao.findAll();
    }

    @RequestMapping(path="/students/{sid}", produces={"application/json"})
    @ResponseBody
    public Optional<Student> getStudents(@PathVariable("sid") int sid) {
        return studentDao.findById(sid);
    }


}
