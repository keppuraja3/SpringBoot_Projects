package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.college.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

	@Query("Select u from Users u where u.userName=?1 and u.userPassword=?2")
	Users findUserByNameAndPass(String username, String password);

}
