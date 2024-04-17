package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.college.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

	@Query("Selec u from Users u where u.userName=?1")
	Users findByName(int id);

}
