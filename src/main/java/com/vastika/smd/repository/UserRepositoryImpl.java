package com.vastika.smd.repository;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vastika.smd.model.User;
import com.vastika.smd.util.QueryUtil;
import com.vastika.smd.util.UserExtractor;
import com.vastika.smd.util.UserRowMapper;

public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	private DataSource dataSource;


	@Override
	public void saveUserInfo(User user) {
		// TODO Auto-generated method stub
		
		getJdbcTemplate().update(QueryUtil.INSERT_SQL, new Object[] {user.getName() , user.getPassword() , user.getEmail(), user.getMobileNo(), 
				user.getDob() , user.getVerificationType() ,user.getGender(), user.getHobbies() , user.getCity() , user.getCountry()});
	

	}

	@Override
	public List<User> getAllUserInfo() {
		// TODO Auto-generated method stub
		
		List<User> userList  = 
		(List<User>) getJdbcTemplate().query(QueryUtil.LIST_SQL, new UserRowMapper());
		return userList;
	}
	
	private JdbcTemplate getJdbcTemplate() {
		
		return new JdbcTemplate(dataSource);
		
	}

	@Override
	public void deleteuserInfo(int id) {
		getJdbcTemplate().update(QueryUtil.DELETE_SQL, new Object[] {id});
		
		
	}

}
