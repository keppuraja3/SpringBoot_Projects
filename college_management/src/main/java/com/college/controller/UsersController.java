package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Users;
import com.college.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173/")
public class UsersController {

	@Autowired
	UsersService userServ;

	@PostMapping("addUser")
	public String addUser(@RequestBody Users user) {
		return userServ.addUser(user);
	}

	@GetMapping("viewUsers")
	public List<Users> viewUsers() {
		return userServ.viewUsers();
	}

	@GetMapping("/viewUser/{username}")
	public Users viewUserByName(@PathVariable String username) {
		return userServ.viewUserByName(username);
	}

	@GetMapping("/deleteUserById/{id}")
	public String getMethodName(@PathVariable int id) {
		return userServ.deleteUserById(id);
	}

	@PostMapping("/updateUserById/{id}")

	public String updateUserById(@RequestBody Users user, @PathVariable int id) {
		return userServ.updateUserById(user, id);
	}

}
