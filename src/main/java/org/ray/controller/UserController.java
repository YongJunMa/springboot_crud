package org.ray.controller;

import java.util.List;

import org.ray.pojo.User;
import org.ray.service.UserService;
import org.ray.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public List<User> list() {
		return userService.findAll();
	}
	
	@GetMapping("/list/{id}")
	public User findById(@PathVariable("id") Integer id) {
		return userService.findById(id);
	}
	
	@GetMapping("/listByPage/{start}")
	public Page4Navigator<User> findByPage(@PathVariable("start") Integer start) {
		/*
		 *   防止出现页码为负数的起始页
		 *   首页从0开始
		*/
		start = start < 0 ? 0 : start;
		return userService.findByPage(start, 5, 5);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody User user) {
		userService.add(user);
	}
	
	@DeleteMapping("/del/{id}")
	public void del(@PathVariable("id") Integer id) {
		userService.del(id);
	}
	
	@PutMapping("/chg")
	public void chg(@RequestBody User user) {
		userService.chg(user);
	}
}
