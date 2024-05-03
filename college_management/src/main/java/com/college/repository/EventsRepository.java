package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.Events;

@Repository
public interface EventsRepository extends JpaRepository<Events, Integer> {

}
