package com.vastika.smd.repository;


import java.util.List;

import com.vastika.smd.model.User;

public interface UserRepository {
	
	
	   void saveUserInfo(User user);
	   
	   List<User> getAllUserInfo();
	   
	   void deleteuserInfo(int id);

}
