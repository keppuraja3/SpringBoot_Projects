package com.college.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String stuName;
    private String stuEmail;
    private String stuCourse;
    private long stuMobileNo;
    private String stuDepartment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public String getStuCourse() {
        return stuCourse;
    }

    public void setStuCourse(String stuCourse) {
        this.stuCourse = stuCourse;
    }

    public long getStuMobileNo() {
        return stuMobileNo;
    }

    public void setStuMobileNo(long stuMobileNo) {
        this.stuMobileNo = stuMobileNo;
    }

    public String getStuDepartment() {
        return stuDepartment;
    }

    public void setStuDepartment(String stuDepartment) {
        this.stuDepartment = stuDepartment;
    }

}
