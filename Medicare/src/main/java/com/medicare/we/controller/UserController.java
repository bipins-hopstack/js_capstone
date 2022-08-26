package com.medicare.we.controller;

import java.util.List;
import java.util.Optional;

import com.medicare.we.user.entity.Users;
import com.medicare.we.user.repo.UsersRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UsersRepo usersrepo;

	@GetMapping("/users")
	public List<Users> getUsers() {
		System.out.println("inside users------" + usersrepo.findAll());
		return usersrepo.findAll();

	}
	@GetMapping("/user/{id}")
	public Optional<Users> getUserById(@PathVariable("id") String userId) {
		System.out.println("inside user by id------" + usersrepo.findById(userId));
		return usersrepo.findById(userId);

	}

	//update method for the user
	@PutMapping("/user")
	public Users updateUserById(@RequestBody Users user) {
		System.out.println("inside user Put map/save------" + usersrepo.save(user));
		return usersrepo.save(user);

	}

	//Delete method
	@DeleteMapping("/user/{id}")
	private  void deleteUser(@PathVariable("id") String userId)
	{
		System.out.println("inside user delete by id------");
		usersrepo.deleteById(userId);
	}



}
