package com.college.service;

import java.util.List;

import com.college.entity.Students;

public interface StudentsService {
    String addStudent(Students students);

    List<Students> viewStudents();

    // Students viewStudentByName(String stuname);

    // Students viewStudentById(int id);

    // String updateUserById(Students stu, int id);

    // String deleteStudentById(int id);
}
