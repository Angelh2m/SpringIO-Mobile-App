package com.appdeveloperblog.app.ws.ui.controller;

import com.appdeveloperblog.app.ws.model.request.UserDetailsRequestModel;
import com.appdeveloperblog.app.ws.model.response.UserRest;
import com.appdeveloperblog.app.ws.service.UserService;
import com.appdeveloperblog.app.ws.shared.dto.UserDto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping
	public String getUser() {
		return "Get user was called";
	}

	@PostMapping
	public UserDto createUser(@RequestBody UserDetailsRequestModel userDetails) {

		UserRest returnValue = new UserRest();

		UserDto userDto = new UserDto();

		BeanUtils.copyProperties(userDetails, userDto);

		UserDto createUser = userService.createUser(userDto);

		return null;
	}

	@PutMapping
	public String updateUser() {
		return "Update user was created";
	}

	@DeleteMapping
	public String deleeteUser() {
		return "Delete user was created";
	}
}
