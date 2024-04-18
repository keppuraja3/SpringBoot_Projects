package com.college.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.Users;
import com.college.repository.UsersRepository;
import com.college.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersRepository userRepo;

	public String addUser(Users user) {
		userRepo.save(user);
		return "User added successfully";
	}

	public List<Users> viewUsers() {

		return userRepo.findAll();
	}

	public Users viewUserByName(String username) {
		return userRepo.findByName(username);
	}

}
