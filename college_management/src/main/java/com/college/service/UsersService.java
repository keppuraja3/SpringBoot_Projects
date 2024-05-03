package com.college.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.college.entity.Users;

public interface UsersService {

	String addUser(Users user);

	List<Users> viewUsers();

	ResponseEntity<?> findUserByNameAndPass(String username, String password);

	String deleteUserById(int id);

	String updateUserById(Users user, int id);

}
