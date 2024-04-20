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

	public String deleteUserById(int id) {
		userRepo.deleteById(id);
		return "Deleted successfully";
	}

	public String updateUserById(Users user, int id) {
		Users u = userRepo.findById(id).get();
		u.setId(user.getId());
		u.setUserEmail(user.getUserEmail());
		u.setUserMobileNo(user.getUserMobileNo());
		u.setUserName(user.getUserName());
		u.setUserPassword(user.getUserPassword());
		u.setUserRole(user.getUserRole());
		userRepo.save(u);
		return "Updated Successfully";

	}

}
