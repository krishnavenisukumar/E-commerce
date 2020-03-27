package com.demo.ecom.controller;

import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.demo.ecom.dto.UserDto;
import com.demo.ecom.dto.UserResponseDto;
import com.demo.ecom.entity.User;
import com.demo.ecom.service.CustomerFeedbackServiceImpl;
import com.demo.ecom.service.UserServiceImpl;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
public class UserControllerTest {

	@Mock
	private UserServiceImpl userServiceImpl;

	@InjectMocks
	private UserController userController;

	@Before(value = "")
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getByUserIdAndPhoneNumberTest() {

		User user = new User();
		UserDto userDto = new UserDto();
		UserResponseDto object = new UserResponseDto();

		userDto.setUserId(1);
		userDto.setphoneNumber("998567899");
		Mockito.when(userServiceImpl.getByUserIdAndPhoneNumber(1, "998567899")).thenReturn(Optional.of(user));
		userController.getUserByIdAndPassword(userDto);
		assertNotNull(object);

	}

}
