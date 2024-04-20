package com.college.service;

import java.util.List;

import com.college.entity.Users;

public interface UsersService {

	String addUser(Users user);

	List<Users> viewUsers();

	Users viewUserByName(String username);

	String deleteUserById(int id);

	String updateUserById(Users user, int id);

}
