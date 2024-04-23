package com.college.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.Students;
import com.college.repository.StudentsRepository;
import com.college.service.StudentsService;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    StudentsRepository stuRepo;

    public String addStudent(Students students) {
        stuRepo.save(students);
        return "Added Successfully";
    }

    public List<Students> viewStudents() {
        return stuRepo.findAll();
    }

    public Students viewStudentByName(String stuname) {
        return stuRepo.findByName(stuname);
    }

    // public String updateUserById(Students stu, int id) {
    // Students u = stuRepo.findById(id).get();
    // u.setId(stu.getId());
    // u.setUserEmail(stu.getUserEmail());
    // u.setUserMobileNo(stu.getUserMobileNo());
    // u.setUserName(stu.getUserName());
    // u.setUserPassword(stu.getUserPassword());
    // u.setUserRole(stu.getUserRole());
    // stuRepo.save(u);
    // return "Updated Successfully";
    // }

    // public String deleteStudentById(int id) {
    // stuRepo.deleteById(id);
    // return "Deleted successfully";
    // }

}
