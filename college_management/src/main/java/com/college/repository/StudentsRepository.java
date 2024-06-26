package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
