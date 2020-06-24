package com.vastika.smd.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vastika.smd.model.User;

public class UserExtractor implements ResultSetExtractor<User>{

	@Override
	public User extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		
User user = new User();
		
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		user.setEmail(rs.getString("email"));
		user.setMobileNo(rs.getFloat("mobileNo"));
		user.setDob(rs.getDate("dob"));
		user.setVerificationType(rs.getString("verificationType"));
		user.setGender(rs.getString("gender"));
		user.setHobbies(rs.getString("hobbies"));
		user.setCity(rs.getString("city"));
		user.setCountry(rs.getString("country"));
		
		return user;
		
	}

}
