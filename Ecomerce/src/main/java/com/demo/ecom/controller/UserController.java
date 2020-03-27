package com.demo.ecom.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecom.dto.UserDto;
import com.demo.ecom.dto.UserResponseDto;
import com.demo.ecom.entity.User;
import com.demo.ecom.service.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping("")
	public ResponseEntity<UserResponseDto> getUserByIdAndPassword(@RequestBody UserDto userDto) {

		UserResponseDto userResponseDto = new UserResponseDto();
		Optional<User> user = userServiceImpl.getByUserIdAndPhoneNumber(userDto.getUserId(), userDto.getphoneNumber());
		if (user.isPresent()) {
			userResponseDto.setDisplayCode(200);
			userResponseDto.setDisplayMessage("You can search and buy using our site");
			return new ResponseEntity<>(userResponseDto, HttpStatus.OK);
		}
		userResponseDto.setDisplayCode(404);
		userResponseDto.setDisplayMessage("Please check the credentials entered");
		return new ResponseEntity<>(userResponseDto, HttpStatus.NOT_FOUND);
	}

}
