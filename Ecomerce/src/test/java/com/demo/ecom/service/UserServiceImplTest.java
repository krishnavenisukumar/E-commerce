package com.demo.ecom.service;

import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.demo.ecom.dao.CustomerFeedbackDAO;
import com.demo.ecom.dao.UserDAO;
import com.demo.ecom.dto.UserDto;
import com.demo.ecom.dto.UserResponseDto;
import com.demo.ecom.entity.User;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
public class UserServiceImplTest {

	@InjectMocks
	UserServiceImpl userServiceImpl;

	@Mock
	UserDAO userDAO;

	@Test
	public void getByUserIdAndPhoneNumberTest() {

		User user = new User();
		UserDto userDto = new UserDto();
		UserResponseDto object = new UserResponseDto();

		userDto.setUserId(1);
		userDto.setphoneNumber("998567899");
		Mockito.when(userDAO.findByUserIdAndPhoneNumber(1, "998567899")).thenReturn(Optional.of(user));
		userServiceImpl.getByUserIdAndPhoneNumber(1, "998567899");
		assertNotNull(object);

	}

}
