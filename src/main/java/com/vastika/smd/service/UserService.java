package com.vastika.smd.service;

import java.util.List;

import com.vastika.smd.model.User;

public interface UserService {

	 void saveUserInfo(User user);
	List<User> getAllUserInfo();
	 void deleteUserInfo(int id);

}
