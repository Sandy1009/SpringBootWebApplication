package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.pojo.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
