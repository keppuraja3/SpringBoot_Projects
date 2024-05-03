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

    // public Students viewStudentById(int id) {
    // return stuRepo.findById(id).get();
    // }

    public String updateStudentById(Students stu, int id) {
        Students u = stuRepo.findById(id).get();
        u.setId(stu.getId());
        u.setStuName(stu.getStuName());
        u.setStuEmail(stu.getStuEmail());
        u.setStuMobileNo(stu.getStuMobileNo());
        u.setStuDepartment(stu.getStuDepartment());
        u.setStuCourse(stu.getStuCourse());

        stuRepo.save(u);
        return "Updated Successfully";
    }

    public String deleteStudentById(int id) {
        stuRepo.deleteById(id);
        return "Deleted successfully";
    }

}
