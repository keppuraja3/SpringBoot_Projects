package com.college.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Students;
import com.college.service.StudentsService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173/")
public class StudentsController {

    @Autowired
    StudentsService stuServ;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Students students) {
        return stuServ.addStudent(students);
    }

    @GetMapping("/viewStudents")
    public List<Students> viewStudents() {
        return stuServ.viewStudents();
    }

    @GetMapping("/deleteStudentById/{id}")
    public String getMethodName(@PathVariable int id) {
        return stuServ.deleteStudentById(id);
    }

    @PostMapping("/updateStudentById/{id}")
    public String updateStudentById(@RequestBody Students stu, @PathVariable int id) {
        return stuServ.updateStudentById(stu, id);
    }

}
