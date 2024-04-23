package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.college.entity.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {
    @Query("Select u from Students u where u.name=?1")
    Students findByName(String u);
}
